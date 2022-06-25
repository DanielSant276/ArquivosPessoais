program ex3;

var 
  n: array [1..15] of integer;
  i, count: integer;

Begin
    i:= 0; 
    count:= 1;
    while i < 15 do
        begin
            Writeln ('Coloque o valor dos 3 lados do triângulo ',count,': ');
            Readln (n[i], n[i+1], n[i+2]);
            
            i:= i + 3;
            count:= count + 1;
        end;
    
    i:= 0;
    count:= 1;
    while i < 15 do
        begin
            if (n[i] + n[i+1] < n[i+2]) or (n[i] + n[i+2] < n[i+1] ) or (n[i+1] + n[i+2] < n[i] ) then
                Writeln ('Triângulo ',count,' não é triângulo.')
            else
                if (n[i] = n[i+1]) and (n[i] = n[i+2]) then
                    Writeln ('Triângulo ',count,' é um triângulo equilátero.')
                else if (n[i] = n[i+1]) or (n[i] = n[i+2]) or (n[i+1] = n[i+2]) then
                    Writeln ('Triângulo ',count,' é um triângulo isósceles.')
                else
                    Writeln ('Triângulo ',count,' é um triângulo escaleno.');
            
            i:= i + 3;
            count:= count + 1;
        end
End.