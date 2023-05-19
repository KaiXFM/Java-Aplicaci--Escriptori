<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://fonts.googleapis.com/css2?family=Averia+Sans+Libre&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="css/style.css">
    <script src="js/functions.js"></script>
    <title>Filmflow</title>
</head>

<body id="cos">

    <header>

        <img src="img/logo.jpg" alt="logo" id="logo">

        <nav id="menu">

            <a id="lupa"><i class="fa fa-search"></i></a>
            <a href="index.php">Inici</a>
            <a href="pelis.php">Pelis</a>
            <a href="series.php">Series</a>
            <?php



            session_start();

            $servername = "localhost";
            $username = "root";
            $password = "1dam2223";
            $dbname = "filmflow";

            $conn = new mysqli($servername, $username, $password, $dbname);


            if (isset($_SESSION['sessio'])) {
                // Si el usuario ha iniciado sesión
            
                echo '<a id="perfil" onclick="desplegar()"><i class="fa fa-user icons icons2"></i> ' . $_SESSION['usuari'] . '</a>';
            } else {
                // Si el usuario no ha iniciado sesión
                echo '<a href="login.php">Log In</a>';
            }


            ?>

        </nav>

    </header>

    <div id="blocllista">
        <div id="llista">
            <a href="perfil.php"><i class="fa fa-user"></i> Perfil</a>
            <a href="vip.php">Vistes i <br>Preferides</a>
            <a href="logout.php"><i class="fa fa-power-off"></i> Log Out</a>
        </div>
    </div>

    <div id="overlay" class="hidden">
        <div id="buscador">
            <div>
                <input type="text" id="buscar" placeholder="Que vols buscar?">

            </div>
            <a id="creueta"><i class="fa fa-times"></i></a>
        </div>
    </div>

    <h1 id="titolseccions">Preferides i Vistes</h1>

    <div id="vip">
    <?php



           

            $servername = "localhost";
            $username = "root";
            $password = "1dam2223";
            $dbname = "filmflow";

            $conn = new mysqli($servername, $username, $password, $dbname);

            $sql = "SELECT foto FROM produccions LIMIT 8";
            
            $resultat = mysqli_query($conn, $sql);

            $datos = array();

            if (mysqli_num_rows($resultat) > 0) {
                while ($row = mysqli_fetch_assoc($resultat)) {
                    $datos[] = $row['foto'];

                }

            }

            foreach ($datos as $dato) {
                // Hacer algo con cada dato
                echo "<img class='vip' src=' " . $dato . "' >";
                
            }

    ?>
    </div>
    

    <footer>
        <p>Feta per Arnau i Xavi</p>
    </footer>

</body>

</html>