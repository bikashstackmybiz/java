public class MultiplicationTable {
    void table(int number) {
        int i;
        System.out.printf("The table of the %d are :-",number).println();
        for (i = 1; i <= 10; i++) {
            
            System.out.printf("%d*%d=%d", number, i, number * i).println();
            
        }
    }

    public static void main(String[] args) {
        MultiplicationTable newTable = new MultiplicationTable();
        // newTable.table(12);
        newTable.table(18);

    }
}
