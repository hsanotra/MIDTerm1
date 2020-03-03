/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

/**
 * date: March 2nd
 * @author Sivagama
 */
public class Account {

    
        private double balance;
        private double interestRate=0.03;
        private String user;
 
     /**constructor that takes the initial balance
      * @param initialBalance 
      */
        public Account(double initialBalance,String givenUser)
        {
            if(initialBalance<50)
            {
                System.out.println("Enter amount above $50 to create account");
                System.exit(0);
            }
            else
            {
                balance=initialBalance;
                System.out.println("Account created");
            }
            
            user=givenUser;
            //Note that the initial balance must be greater than 50.       
        }

     /**The method for depositing amount and 
      * updating balance*/
        public void credit(double amount)
        {
            balance=getBalance()+amount;
        }

     /**The method for debit(withdrawing amount) and 
      * updating balance */
        public void debit(double amount)
        {
            balance=getBalance()-amount;

        }
        
     /**The getter for the balance
     * @return the balance
     */
        public double getBalance() 
        {
        return balance;
        }

    /**The getter for InterestRate
     * @return the interestRate
     */
        public double getInterestRate() 
        {
            return interestRate;
        }
        

    /**user is the read only field
     * @return the user
     */
    public String getUser() {
        return user;
    }
    public double findBal()  // method to find final balance after applying interest rate
    {
        double curr_bal=balance*interestRate;
        return curr_bal;
    }
    
    
}//class end
