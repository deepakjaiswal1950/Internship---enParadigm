<!DOCTYPE html>
<html>
<body>

<!-- PHP FUNCTION -->
<?php 
// Function with return
function add($x, $y) {
  $z = $x + $y;
  return $z;
}
echo "Addition of 5 + 10 = " . add(5, 10)."<br>";


// Function without return and reference
function add_five(&$value) {
    $value += 5;
  }
  
$num = 2;
add_five($num);

echo "After adding 5, num = ". $num ."<br>";
?>

</body>
</html>