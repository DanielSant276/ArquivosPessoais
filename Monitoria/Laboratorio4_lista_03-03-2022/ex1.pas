program ex1;

var X, Y, Z : Integer;

Begin
  Writeln ('Digite três Números:');
  Readln (X, Y, Z);
  
  if (X + Y < Z ) then
    Writeln ('Não é triângulo.')
  else if (X + Z < Y ) then
    Writeln ('Não é triângulo.')
  else if (Y + Z < X ) then
    Writeln ('Não é triângulo.')
  else
    Writeln ('É triângulo.')
End.