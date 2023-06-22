public class AplikasiTodoList {

    public static String[] model = new String[10];

    public static void main(String[] args){
        testShowTodoList();

    }
    //    Business Logic
    /**
     * Menampilkan todo list
     */
    public static void showTodoList(){
        for (var i=0; i < model.length; i++){
            var todo = model[i];
            var no = i + 1;
            if (todo != null) {
                System.out.println(no + ". " + todo); // Gunakan String Literal
            }
        }
    }

    public static void testShowTodoList(){
        model[0] = "Eating";
        model[1] = "Driving";
        showTodoList();
    }

    /**
     * Menambah todo list
     */
    public static void addTodoList(){

    }

    /**
     * Menghapus todo list
     */
    public static void removeTodoList(){

    }

//    Menentukan View

    /**
     * Menampilkan view todo list
     */
    public static void viewShowTodoList(){

    }

    /**
     * Menampilkan view add todo list
     */

    public static void viewAddTodoList(){

    }

    /**
     * Menampilkan view remove todo list
     */
    public static void viewRemoveTodoList(){

    }

}
