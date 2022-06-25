Program q5_fibonacci ;
var n, i, num1, num2, fibonacci: integer;
Begin
   fibonacci := 0;
   num1 := 0;
   num2 := 1;
   writeln('Digite a quantidade de termos da sequência: ');
   readln(n);
  write('Sequência: ');
   for i:=1 to n do
   	begin
   		num1:=num2;
   		num2:= fibonacci;
   		fibonacci := num1+num2;
   		write(fibonacci, ', ');
   	end;
End.
{
	fib = 0
	n1 = 0
	n2 = 1
	==========
	n1 = 1
	n2 = 0
	fib = 1
	
	n1 = 0
	n2 = 1
	fib = 1
	
	n1 = 1
	n2 = 1
	fib = 2
	
	n1 = 1
	n2 = 2
	fib = 3
	
	n1 = 2
	n2 = 3
	fib = 5
}