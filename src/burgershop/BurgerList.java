
package burgershop;

public class BurgerList {
    private Burger[] burgerArray;
    final double eachPrice=500;
    
    BurgerList(Burger[] burgerArray){
        this.burgerArray=burgerArray;
    }
    
    public void addDataToArray(Burger burger){
        burgerArray=extendsArray(burgerArray);
        burgerArray[burgerArray.length-1]=burger;
    }
    
    private Burger[] extendsArray(Burger[] array){
        Burger[] tempArray=new Burger[array.length+1];
        for (int i = 0; i < array.length; i++) {
            tempArray[i]=array[i];
        }
        return tempArray;
    }
    
    public Burger[] getArray(){
        return  burgerArray;
    }
    
    private Burger[] customerOrderTotal(){
        Burger[] temp=new Burger[0];
        double tot=0.0;
        if(burgerArray.length>0){
            
            for (int i = 0; i < burgerArray.length; i++) {
                tot=0.0;
                boolean have=false;
                for (int j = 0; j < temp.length; j++) {
                    if(temp[j].getCustomerId().equalsIgnoreCase(burgerArray[i].getCustomerId())){
                        have=true;
                    } 
                }
                
                if(have){
                    continue;
                }else{
                    temp=extendsArray(temp);
                    temp[temp.length-1]=burgerArray[i];
                    tot+=burgerArray[i].getTotal();

                    for (int j = 1+i; j < burgerArray.length; j++) {
                        if(temp[temp.length-1].getCustomerId().equalsIgnoreCase(burgerArray[j].getCustomerId())){
                            tot+=burgerArray[j].getTotal();
                        }
                    }
                }
                temp[temp.length-1].setTotal(tot);
            }
            
        }
        return temp;
    }
    
    public Burger[] getSortedArray(){
        
        Burger[] tempArray=customerOrderTotal();
        if(tempArray.length!=0){
            for (int i = 0; i < tempArray.length; i++) {
                for (int j = 1+i; j < tempArray.length; j++) {
                    if(tempArray[i].getTotal()<tempArray[j].getTotal()){
                        Burger temp=tempArray[i];
                        tempArray[i]=tempArray[j];
                        tempArray[j]=temp;
                    }
                }
            }
        }
        return tempArray;
    }
    
}
