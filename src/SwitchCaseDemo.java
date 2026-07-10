
class SwitchCaseDemo {
    public static void main(String[] args) {
        String name = "Pradnya";
        System.out.println("------------------1st STYLE (CLASSIC)----------------------");
        switch(name){
            case "Pradnya":
                System.out.println("In Pradnya Block");
                break;
            case "Rohan":
                System.out.println("In Rohan Block");
                break;
            default:
                System.out.println("In Parnavi Block");
        }
        System.out.println("----------------2st STYLE (CLASSIC WITH YIELD)  (SWITCH AS EXPRESSION)------------------------");
        name = "Pradnya";
        name = switch(name){
            case "Pradnya":
                yield "In Pradnya Block";
            case "Rohan":
                yield  "In Rohan Block";
            default:
                yield "In Parnavi Block";
        };
        System.out.println(name);
        System.out.println("-----------------3rd STYLE  (WITH ARROW)-----------------------");
        switch(name) {
            case "Pradnya" -> System.out.println("In Pradnya Block");
            case "Rohan" -> System.out.println("In Rohan Block");
            default -> System.out.println("In Parnavi Block");
        }
        System.out.println("-----------------4th Style (SWITCH AS EXPRESSION)------------------------");
        String name1 = switch(name){
            case "Pradnya" -> "In Pradnya Block";
            case "Rohan"-> "In Rohan Block";
            default ->  "In Parnavi Block";
        };
        System.out.println(name1);
    }
}