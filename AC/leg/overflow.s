  .org 0x300
A: .word 2147483647
  .org 0x304
B: .word 2147483647

  .org 0x10
_start:
  set r0, A
  set r1, B

  ld r2, [r0]
  ld r3, [r1]
  add r2, r3
  add r2, r3
  hlt
