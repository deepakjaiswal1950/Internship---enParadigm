<!DOCTYPE html>
<html>
<body>

<!-- PHP LOOP -->
<?php
$x = 1;

echo "Below is while loop output<br>";

while($x <= 5) {
  echo "The number is: $x <br>";
  $x++;
}

echo "<br>Below is for loop output<br>";
for ($x = 1; $x <= 10; $x++) {
  echo "The number is: $x <br>";
}


$colors = array("red", "green", "blue", "yellow"); // Declare array in php

echo "<br>Below is foreach loop output<br>";
foreach ($colors as $value) {
  echo "$value <br>";
}

?>


</body>
</html>