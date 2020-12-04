public class LeetCode860 {


    public boolean lemonadeChange (int[] bills){
        LeetCode860 text = new LeetCode860();


            int five = 0,ten = 0;
            for(int value : bills){
                if(value == 5){
                    five++;
                }else if(value == 10){
                    if(five == 0) return false;
                    five--;
                    ten++;
                }else{
                    if(ten >= 1 && five >= 1){
                        ten--;
                        five--;
                    }else if(five >= 3){
                        five = five - 3;
                    }else{
                        return false;
                    }
                }
            }
            return true;
        }

    public static void main(String[] args) {
        int[] intArray1 = new int[]{5, 10, 20};
        LeetCode860 text = new LeetCode860();
        System.out.println(text.lemonadeChange(intArray1));
    }
    }


