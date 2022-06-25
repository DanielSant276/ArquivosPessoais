let a = [[8, 3], [2, 4], [3, 6]];
let b = [[1, 2, 3], [4, 6, 8]];
let m = new Array(a.length);

for (var r = 0; r < a.length; ++r) {
  m[r] = new Array(b[0].length); // initialize the current row
  for (var c = 0; c < b[0].length; ++c) {
    m[r][c] = 0;             // initialize the current cell
    for (var i = 0; i < a[0].length; ++i) {
      m[r][c] += a[r][i] * b[i][c];
    }
  }
}

console.log(m);