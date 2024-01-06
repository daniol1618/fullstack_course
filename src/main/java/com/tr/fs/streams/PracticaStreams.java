package com.tr.fs.streams;

import com.tr.fs.streams.world.Order;
import com.tr.fs.streams.world.Product;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.stream.Collectors;

public class PracticaStreams {

    public static void main(String[] args) {
        List<Widget> widgets = new ArrayList<>(
                List.of(
                        Widget.builder().color(Color.RED).weight(1).name("Clock").build(),
                        Widget.builder().color(Color.YELLOW).weight(2).name("Timer").build(),
                        Widget.builder().color(Color.BLUE).weight(3).name("Whatsapp").build(),
                        Widget.builder().color(Color.RED).weight(4).name("Email").build(),
                        Widget.builder().color(Color.RED).weight(5).name("news").build()
                )
        );

        //1. Printing the Widgets
        System.out.println("List of Widgets: " + "\n" + widgets + "\n");


        //2. Example from Docs
        int sum = widgets.stream()
                .filter(w -> w.getColor().equals(Color.RED))
                .mapToInt(w -> w.getWeight())
                .sum();

        System.out.println("2. The Sum of weights is : " + sum + "\n");

        //3.Terminal Operators: forEach ; performs the operation in an unordered manner If the stream is parallel, there's no guarantee on the order in which the elements will be processed.
        widgets.stream()
                .forEach(w -> {
                    w.setColor(Color.YELLOW);
                    System.out.println("ForEach:" + w);
                });

        System.out.println("\n");
        //4. Terminal Operators: forEachOrdered; performs the operation in an ordered manner in the way the elements were inserted into the list
        widgets.stream()
                .forEachOrdered(w -> {
                    w.setColor(Color.YELLOW);
                    System.out.println("ForEachOrdered:" + (w));
                });

        //4. Terminal Operators: Collect; collect elements from the widgets stream into a Set using the collect method with Collectors.toSet()
        widgets.add(Widget.builder().color(Color.RED).weight(1).name("Clock").build());
        widgets.add(Widget.builder().color(Color.RED).weight(1).name("Clock").build());
        widgets.add(Widget.builder().color(Color.RED).weight(1).name("Clock").build());

        Set<Widget> collected = widgets.stream()
                .collect(Collectors.toSet());
        System.out.println("\n" + "Collect: " + collected + "\n");

        //5.Terminal Operators: Max; returns the object that inside the comparator has a maximum value
        Optional<Widget> max = widgets.stream()
                .max(Comparator.comparingInt(w -> w.getWeight()));
        System.out.println("Max: " + max + "\n");

        //6. Terminal Operators: Min; returns the object that inside the comparator has a minimum value
        Optional<Widget> min = widgets.stream()
                .min(Comparator.comparing(w -> w.getName()));
        System.out.println("Min: " + min + "\n");

        //7. Terminal Operators: Count; Counts the elements in the stream
        long count = widgets.stream()
                .count();
        System.out.println("Count elements in original object: " + count + "\n");

        //8. Terminal Operator: allMatch; returns true/false if all the elements match the predicate
        boolean clock = widgets.stream()
                .allMatch(w -> w.getName().equals("Clock"));
        System.out.println("Are all the elements of type Clock?: " + clock + "\n");

        //9. Terminal Operator: anyMatch; returns true/false if any of the elements match the predicate
        boolean anyClock = widgets.stream()
                .anyMatch(w -> w.getName().equals("Clock"));
        System.out.println("Are there any elements of type Clock?: " + anyClock + "\n");

        //10. Terminal Operator: noneMatch; returns true if none of the elements match the predicate
        boolean noClock = widgets.stream()
                .noneMatch(w -> w.getName().equals("Voice Recorder"));
        System.out.println("There are no voice recorder in the widgets collection, right?: " + anyClock + "\n");

        //11. Terminal Operator: findAny; returns any element of the collection, non-deterministic
        Optional<Widget> anyElement = widgets.stream()
                .findAny();
        System.out.println("Any Element of the Collection: " + anyElement + "\n");

        //12. Terminal Operator: findFirst; returns the first element of the Collection
        Optional<Widget> firstElement = widgets.stream()
                .findFirst();
        System.out.println("First Element of the Collection: " + firstElement + "\n");

        //13. Terminal Operator: toArray; Returns an array containing the elements of this stream.
        Object[] array = widgets.stream()
                .toArray();
        System.out.println("toArray: Array of Widgets: " + "\n");

        for (Object o : array) {
            System.out.println(o);
        }

        //14. Terminal Operator: Reduce; combine the elements of a stream to produce a single result
        //With reduce I can combine elements, sum elements, and that is not achievable with sum, count.
        int reducedNumbers = widgets.stream()
                .mapToInt(Widget::getWeight)
                .reduce(0, (subtotal, element) -> subtotal + element);

        System.out.println("\n" + "Reduced Numbers: " + reducedNumbers + "\n");

        String reducedString = widgets.stream()
                .map(w -> w.getName())
                .reduce("R: ", (a, b) -> a + ";" + b);

        System.out.println("\n" + "Reduced String: " + reducedString);


        //Intermediate Operators
        System.out.println("<--------------------- INTERMEDIATE OPERATORS --------------------->");

        //15. Intermediate Operators: Map; performs a transformation to the element of the stream based on the given function, returns the modified element not the entire stream
        List<String> collectedList = widgets.stream()
                .map(w -> w.getName() + "-")
                .collect(Collectors.toList());
        System.out.println(collectedList);

        //16. Intermediate Operators: filter; Returns a stream consisting of the elements of this stream that match the given predicate.
        widgets.stream()
                .filter(w -> w.getColor().equals(Color.RED))
                .forEach(w -> System.out.println("Filter: " + w));

        //17. Intermediate Operators: distinct; Returns a stream consisting of the distinct elements (according to Object.equals(Object)) of this stream.
        widgets.stream()
                .distinct()
                .forEach(w -> System.out.println("Distinct: " + w));

        //18 Intermediate Operators: mapToInt; returns an IntStream consisting of the results of applying the given function to the elements of this stream
        int sumMapToInt = widgets.stream()
                .mapToInt(w -> w.getWeight())
                .sum();

        System.out.println("\n" + "MapToInt: " + sumMapToInt + "\n");

        //19. Intermediate Operators; mapToDouble; Returns a DoubleStream consisting of the results of applying the given function to the elements of this stream.
        System.out.println("\n" + "MapToDouble: ");
        widgets.stream()
                .mapToDouble(w -> w.getWeight() + .01)
                .forEach(System.out::println);


        //20. Intermediate Operators; mapToLong returns a LongStream consisting of the results of applying the given function to the elements of this stream.
        System.out.println(widgets);
        System.out.println("\n" + "MapToLong: ");
        widgets.stream()
                .mapToLong(w -> w.getWeight() + 5l)
                .forEach(System.out::println);

        //21. Intermediate Operators; flatMap when you have nested elements inside the collection and want to flat them to use them without having
        // to get into them
        List<Product> productList = new ArrayList<>(
                List.of(
                        new Product(10091, "Chicken", new BigDecimal(5.65)),
                        new Product(10092, "Rice", new BigDecimal(3.45)),
                        new Product(10093, "Hamburger", new BigDecimal(12.55))
                )
        );
        List<Product> productList2 = new ArrayList<>(
                List.of(
                        new Product(10094, "Potatoes", new BigDecimal(4.56)),
                        new Product(10092, "Rice", new BigDecimal(3.45)),
                        new Product(10095, "Beef", new BigDecimal(10.89))
                )
        );

        List<Order> orders = new ArrayList<>(List.of(
                Order.builder().id(1).amount(BigDecimal.valueOf(10)).productList(productList).build(),
                Order.builder().id(2).amount(BigDecimal.valueOf(14)).productList(productList2).build(),
                Order.builder().id(3).amount(BigDecimal.valueOf(14)).productList(productList2).build(),
                Order.builder().id(4).amount(BigDecimal.valueOf(10)).productList(productList).build()
        ));

        System.out.println("\n" + "Orders: " + orders + "\n");

        BigDecimal sumarizedAmount = orders.stream()
                .flatMap(w -> w.getProductList().stream())
                .map(w -> w.getPrice())
                .reduce(BigDecimal.ZERO, (bigDecimal, bigDecimal2) ->
                        bigDecimal.add(bigDecimal2)
                );

        System.out.println("FlatMap : The total Amount of the order is: $" + sumarizedAmount.setScale(2, RoundingMode.CEILING));

        //22. Intermediate Operators: flatMapToInt; returns an IntStream consisting of the results of replacing each element of this stream with the contents of a mapped stream produced by applying the provided mapping function to each element
        int sumFlatMapToInt = orders.stream()
                .flatMapToInt(w -> w.getProductList().stream().mapToInt(x -> x.getIdentification()))
                .sum();

        System.out.println("\n" + "FlatMapToInt:" + sumFlatMapToInt);

        //23. Intermediate Operators: sorted; returns a stream consisting of the elements of this stream, sorted according to the provided Comparator
        List<Widget> sortedWidgets = widgets.stream()
                .sorted(Comparator.comparing(widget -> widget.getName()))
                .collect(Collectors.toList());

        System.out.println("\n" + "Sorted Widgets: " + sortedWidgets + "\n");

        //24. Intermediate Operators: peek; This method exists mainly to support debugging, where you want to see the elements as they flow past a certain point in a pipeline
        widgets.stream()
                .filter(widget -> widget.getName().equals("news"))
                .peek(w -> System.out.println("Peek Value: " + w + "\n"))
                .collect(Collectors.toList());

        //25. Intermediate Operators: limit; returns a stream of elements truncated to be no longer than maxSize in length
        widgets.stream()
                .limit(3)
                .forEach(x -> System.out.println("Limit: " + x));

        //25. Intermediate Operators: skip; returns a stream with the remaining elements after discarding the first n elements
        System.out.println("Total Widgets: ");
        System.out.println(widgets);
        System.out.println("Skip: ");
        widgets.stream()
                .skip(6)
                .forEach(System.out::println);



    }
}
