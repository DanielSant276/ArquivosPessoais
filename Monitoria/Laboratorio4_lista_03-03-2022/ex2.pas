program ex2;

var X, Y, Z : Integer;

Begin
  Writeln ('Digite três Números:');
  Readln (X, Y, Z);
  
  if (X + Y < Z) or (X + Z < Y ) or (Y + Z < X ) then
    Writeln ('Não é triângulo.')
  else
    if (X = Y) and (X = Z) then
        Writeln ('É um triângulo equilátero.')
    else if (X = Y) or (X = Z) or (Y = Z) then
        Writeln ('É um triângulo isósceles.')
    else
        Writeln ('É um triângulo escaleno.')
End.