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