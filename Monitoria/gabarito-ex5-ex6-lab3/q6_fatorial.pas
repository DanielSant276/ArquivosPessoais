Program q6_fatorial ;
var i, num, fatorial, contador: integer;
Begin
  writeln('Digite o numero a ser calculado: ');
  readln(num);
  fatorial := 1;
  contador := 1;
  for i:= 1 to num do
  	begin 
	  	fatorial := fatorial * contador;
	  	contador := contador +1;
  	end;
  	writeln('O valor de ', num, '! é ', fatorial);
End.