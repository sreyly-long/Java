package Midterm;

    public class Account {
        private int id;
        private String name;
        private double balance = 0;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }
        public Account(int id, String name){
            this.id = id;
            this.name = name;
        }

        public Account(int id, String name, double balance){
            this.id = id;
            this.name = name;
            this.balance = balance;
        }
        public double credit(double amount){
            return amount;
        }
        public double debit(double amount){
            if(amount <= balance){
                return balance - amount;
            }else System.out.println("Amount exceeded balance");
            return balance;
        }

        public double transferTo(Account another, double amount){
            if(amount<= balance)
                return amount;
            else System.out.println("Amount exceeded balance");
            return amount;
        }
        public String showResult(){
            System.out.println("Acccount id="+getId());
            System.out.println("Name="+getName());
            System.out.println("Balance="+getBalance());
            return showResult();

        }
    }

