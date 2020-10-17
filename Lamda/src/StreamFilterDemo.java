import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilterDemo {
    public static void main(String[] args) {

        List<Employee> employeeList = EmployeeDataLoader.getEmployeeList();
        Stream<Employee> stream = employeeList.stream();

        /**
         * meaning of Integer::new -> (value) -> new Integer(value)
         * meaning of Employee::getName -> (employee) -> employee.getName()
         */

        /**Apply Filter extract results to list.**/
        Predicate<Employee> singleEmployeePredicate = employee -> employee.getStatus().equals(Employee.SINGLE);
        List<Employee> singleList = stream.filter(singleEmployeePredicate).collect(Collectors.toList());
        singleList.forEach(sing -> System.out.println(sing.toString()));

        //How to use allMatch, anyMatch and noneMatch
        /**
         * Stream.allMatch -> That predicate is applied to each element of stream and if each and every element satisfies the predicate then it returns true otherwise false.
         * Stream.anyMatch -> The element of stream is iterated for this predicate. If any element matches then it returns true otherwise false.
         * Stream.noneMatch -> NoneMatch method is a method which takes argument as a predicate and if none of element of stream matches the predicate, then it returns true else false.
         */
        Stream<Employee> stream1 = employeeList.stream();
        Predicate<Employee> employeeNumberGreaterThan = employee -> employee.getEmployeeNumber() > 1;
        boolean allMatch = stream1.allMatch(employeeNumberGreaterThan);
        Stream<Employee> stream2 = employeeList.stream();
        boolean anyMatch = stream2.anyMatch(employeeNumberGreaterThan);
        Stream<Employee> stream3 = employeeList.stream();
        boolean noneMatch = stream3.noneMatch(employeeNumberGreaterThan);
        System.out.println("AllMatch -> {" + allMatch + "}, AnyMatch -> {" + anyMatch + "}, NonMatch -> {" + noneMatch + "}");
        //out put AllMatch -> {false}, AnyMatch -> {true}, NonMatch -> {false}


        //How to use findAny, findFirst, limit, max, min

        Stream<Employee> stream4 = employeeList.stream();
        Optional<Employee> findAny = stream4.filter(singleEmployeePredicate).findAny(); //Return Random Element from the Filtered Stream
        Stream<Employee> stream5 = employeeList.stream();
        Optional<Employee> findFirst = stream5.filter(singleEmployeePredicate).findFirst(); //Return First Element from the Filtered Stream.
        if (findAny.isPresent() && findFirst.isPresent() )
        {
            Employee anyEmployee = findAny.get();
            Employee firstEmployee = findFirst.get();
            System.out.println( "Any Employee -> {" + anyEmployee +" }, First Employee -> { "+ firstEmployee+" }");

        }
        Stream<Employee> stream6 = employeeList.stream();
        Stream<Employee> stream7 = stream6.filter(singleEmployeePredicate).limit(10);
        stream7.forEach(System.out::println); //limit method of stream API, returns stream instance with the given number of element in limit as an argument.

        //max method returns maximum element on the basis of given comparator. It returns Optional instance.
        Optional<Employee> max = employeeList.stream().filter(singleEmployeePredicate).max(new EmployeeComparator());
        //min method returns minimum element on the basis of given comparator. It returns Optional instance.
        Optional<Employee> min = employeeList.stream().filter(singleEmployeePredicate).min(new EmployeeComparator());
        if ( max.isPresent() && min.isPresent() )
        {
            Employee maxEmployee = max.get();
            Employee minEmployee = min.get();
            System.out.println( "Max Employee -> {" + maxEmployee +" }, Min Employee -> { "+ minEmployee+" }");
        }

        //How to use count and distinct operations
        long singleStateCount = employeeList.stream().filter(singleEmployeePredicate).count();
        System.out.println("Single Employees are -> " + singleStateCount);
        Stream<Employee> distinctStream = employeeList.stream().filter(singleEmployeePredicate).distinct();
        distinctStream.forEach(System.out::println);

        /**
         * Reduce Functionality.
         */
        Stream<Integer> employeeNumberStream = employeeList.stream().map(Employee::getEmployeeNumber);
        int sum = employeeNumberStream.mapToInt(Integer::new).sum(); //map to int use convert to integer list.
        System.out.println("Sum of Passenger numbers -> { " + sum + "}");
        Stream<Integer> employeeNumberStream1 = employeeList.stream().map(Employee::getEmployeeNumber);
        Optional<Integer> sumValue = employeeNumberStream1.reduce((x, y) -> x + y); // without initial value return optional
        System.out.println(sumValue);
        Stream<Integer> employeeNumberStream2 = employeeList.stream().map(Employee::getEmployeeNumber);
        long sumValue1 = employeeNumberStream2.reduce(0, (x, y) -> x + y); //initial value with is zero
        System.out.println(sumValue1);

        //mapFunctionality
        Stream<String> passengerNames = employeeList.stream().map(Employee::getName);
        passengerNames.forEach(System.out::println);

        //GroupBy Functionality.
        //Grouping list by single married as a key.
        Map<String, List<Employee>> groupByStatus = employeeList.stream().collect(Collectors.groupingBy(Employee::getStatus));
        System.out.println(groupByStatus);
        //Group list as single married as key and get salary for one shot against them.
        Map<String, Double> salaryWithStatus = employeeList.stream().collect(Collectors.groupingBy(Employee::getStatus, Collectors.summingDouble(Employee::getSalary)));
        System.out.println(salaryWithStatus);
        //partition grouping salary ( if salary is greater than 120, is one partition)
        Map<Boolean, List<Employee>> collect = employeeList.stream().collect(Collectors.partitioningBy(employee -> employee.getSalary() > 120));
        System.out.println(collect);

        //HashMap Operations
        // Print the key value pair in one line.
        //hm.forEach((k,v) -> System.out.println("key: "+k+" value:"+v));

    }

}
