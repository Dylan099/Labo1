public static void main(String []args)
{

}
public static void primo(int numero)
{
	int c = 0;
	for(int i = 1; i<=numero; i++)
	{
		if(numero%i==0){c++;}
	}
	if(c==2){
	System.out.println("Es primo");
	}
	else{
	System.out.println("No es primo");
	}
}

public static int factorialRecursivo(int num){
        if(num==1 || num==0){
            return 1;
        }else{
            return factorialRecursivo(num-1)*num;
        }
    }

public static int fibonacci(int num){
        if(num==1){
            return 1;
        }else if(num==0){
            return 0;
        }else{
            int a=1;
            int b=1;
            int actual=0;
            for(int i=2;i<num;i++){
                actual=a+b;
                b=a;
                a=actual;
            }
            return actual;
        }
    }
