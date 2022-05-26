<!DOCTYPE html>
<html>
<body>

<!-- PHP CLASS & OBJECT -->
<?php
class Fruit {

    // Properties
    public $name;
    public $color;

     // Contructor
     function __construct() {
        $this->name = null;
        $this->color = null;
      }

    // Methods
    function set_name($name) {
        $this->name = $name;
    }
    function get_name() {
        return $this->name;
    }
    function set_color($color) {
        $this->color = $color;
    }
    function get_color() {
        return $this->color;
    }
}




$apple = new Fruit(); // create object of fruit class

echo "Name and Color before getter-setter:<br>";
echo "Name: " . $apple->get_name(); // call getters
echo "<br>";
echo "Color: " . $apple->get_color() ."<br>";




$apple->set_name('Apple');  // call setters
$apple->set_color('Red');


echo "Name and Color after getter-setter:<br>";
echo "Name: " . $apple->get_name(); // call getters
echo "<br>";
echo "Color: " . $apple->get_color();
?>
</body>
</html>