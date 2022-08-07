package jalau.at18.katas.likes.rodrigov;
public class Main {
    public static void main(String[] args) {
        String Names[]={"Alex","Jacob","Mark","Max","Nathan"};
        String NameDisplay = "";
        if(Names.length==0){
            NameDisplay="no one like this";
        }else{
            if(Names.length==1){
                NameDisplay=Names[0]+" like this";
            }else{
                if(Names.length==2){
                    NameDisplay=Names[0]+" and "+Names[1]+" like this";
                }else{
                    if(Names.length==3){
                        NameDisplay=Names[0]+", "+Names[1]+" and "+Names[2]+" like this";
                    }else{
                        if(Names.length>=4){
                            NameDisplay=Names[0]+", "+Names[1]+" and "+(Names.length-2)+" others like this";
                        }
                    }
                }
            }            
        }
        System.out.println(NameDisplay);
    }
}
