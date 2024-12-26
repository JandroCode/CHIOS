import javax.swing.plaf.PanelUI;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Archivo {

    //CREACIÓN DE ARCHIVOS
    public void createFile(){
        // Creo objetos de tipo File
        //File file = new File("ejemplo.txt");
        File file = new File("C:\\Users\\Algar\\Desktop\\ejemplo.txt");

        // Llamado al método createNewFile() para poder crear el fichero físico
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Error en la creación del archivo");
            throw new RuntimeException(e);
        }
        // Para crear un archivo en una ruta diferente al workspace del entorno de desarrollo
    }

    //CREACIÓN DE DIRECTORIOS
    public void createDirectory(){

        // Creación de un objeto de tipo file
        File carpeta = new File("ejemplo");

        // Llamada al método mkdir() para crear físicamente la carpeta
        carpeta.mkdir();
    }

    // LISTAR LOS ARCHIVOS DE UN DIRECTORIO
    public void filesList(){
        // Creación de ua ruta
        String ruta = "ejemplo";

        //Creación de un archivo de tipo File
        File file = new File(ruta);

        //Almacenar la lista de archivos en un array
        String[] ficheros = file.list();

        // Recorrer la lista de archivos e imprimirlos por consola
        for(int i=0; i<ficheros.length; i++){
            System.out.println(ficheros[i]);
        }
    }

    // VERIFICAR SI UN ARCHIVO EXISTE EN UN DIRECTORIO
    public void filesVerify(){

        /// Creo la ruta
        //String rutaDirectorio = "ejemplo\\saludar.xml";
        String rutaDirectorio = "ejemplo\\archivo1.txt";

        // Creo un obeto de tipo file
        File archivoBuscado = new File(rutaDirectorio);

        // Verifico si el archivo existe o no con el método isFile()
        if(archivoBuscado.isFile()){
            System.out.println("El archivo existe");
        }else{
            System.out.println("El archivo no existe");
        }
    }

    // Verificar si una carpeta existe
    public void directoryVerify(){

        /// Creo la ruta
        String rutaDirectorio = "ejemplo";

        // Creo un obeto de tipo file
        File archivoBuscado = new File(rutaDirectorio);

        // Verifico si el archivo existe o no con el método isDirectory()
        if(archivoBuscado.isDirectory()){
            System.out.println("La carpeta existe");
        }else{
            System.out.println("La carpeta no existe");
        }

    }

    // EXTRAER INFORMACIÓN DEL ARCHIVO
    public void getFileInfo(){

        // Creo la ruta
        String ruta = "ejemplo/archivo1.txt";

        //Creo el objeto de tipo File
        File file = new File(ruta);

        // Verifico si el archivo existe
        if(file.isFile()){

            // Ver el nombre del archivo
            System.out.println("Nombre: " + file.getName());

            // Ver la ruta del archivo
            System.out.println("Ruta: " + file.getAbsolutePath());

            System.out.println("");

            // Ver si el archivo tiene permisos de lectura
            System.out.println("Se puede leer ?" );
            if(file.canRead()){
                System.out.println("si");
            }else{
                System.out.println("no");
            }

            System.out.println("");

            // Ver si iel archivo tiene permisos de escritura
            System.out.println("Se puede escribir ? ");
            if(file.canRead()){
                System.out.println("si");
            }else {
                System.out.println("no");
            }

            System.out.println("");

            // Ver el tamaño del archivo
            System.out.println("Tamaño: " + file.length());

            // Ver el nombre del directorio padre
            System.out.println("Directorio padre: " + file.getParent());

        }else{
            System.out.println("El archivo no existe");
        }
    }


    // Crear archivos y meterlos en carpetas
    public void createFilesInDirectories(){
        // Creo los objetos de tipo File para las carpetas
        File carpetaUno = new File("carpetaUno");
        File carpetaDos = new File("carpetaDos");

        // Creo físicamente la carpetas y compruebo si han sido creadas
        if( carpetaUno.mkdir()){
            System.out.println("Carpeta " + carpetaUno.getName()+ " creada");
        }
        if( carpetaDos.mkdir()){
            System.out.println("Carpeta " + carpetaDos.getName()+ " creada");
        }

        // Creo objetos de tipo File para los archivos y los introduzco dentro de carpetas
        File ficheroUno = new File(carpetaUno, "fichero_uno.txt");
        File ficheroDos = new File(carpetaUno, "fichero_dos.txt");

        File ficheroTres = new File(carpetaDos, "fichero_tres.txt");
        File ficheroCuatro = new File(carpetaDos, "fichero_cuatro.txt");

        // Verifico si el fichero ha sido creado y creo al mismo tiempo los archivos
        try {
            if(ficheroUno.createNewFile())
                System.out.println("Fichero " + ficheroUno.getName() + " creado");
            if(ficheroDos.createNewFile())
                System.out.println("Fichero " + ficheroDos.getName() + " creado");
            if(ficheroTres.createNewFile())
                System.out.println("Fichero " + ficheroTres.getName() + " creado");
            if(ficheroCuatro.createNewFile())
                System.out.println("Fichero " + ficheroCuatro.getName() + " creado");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // MOVER ARCHIVOS DE UNA RUTA ORIGEN A UNA RUTA DESTINO
    public void moveFiles(){

        // Creo una ruta origen
        String rutaOrigen = "origen/fichero.txt";

        // Creo una ruta destino
        String rutaDestino = "destino/fichero.txt";

        // Creo una objejo de tipo Path pasándole la ruta origen como argumento
        Path origenPath = Paths.get(rutaOrigen);

        // Creo una objejo de tipo Path pasándole la ruta destino como argumento
        Path destinoPath = Paths.get(rutaDestino);

        // Uso de las librerías de Path el método move() que me sirve para mover los archivos
        try {
            Files.move(origenPath, destinoPath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // ESCRIBIR EN ARCIVOS
    public void writeFiles(){

        // Creo un objeto de tipo File
        File file = new File("mi_carpeta\\ejemplo.txt");


        if(file.isFile()){

            // Creo un objeto de tipo escritor y ponerlo en modo append(true)
            try(FileWriter fileWriter = new FileWriter(file, true)){

                // Llamando al método write() del objeto escritor
                fileWriter.write("Escribiendo..." + "\r\n");

                System.out.println("Estás escribiendo dentro de un archivo");

                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }else {
            System.out.println("El archivo no existe");
        }

    }

    // LEER ARCHIVOS
    public void readFiles(){
        // Creo un objeto de tipo File
        File file = new File("mi_carpeta\\ejemplo.txt");

        // Creo un objeto de tipo lector y uso un buffer de lectura para poder almacenar en memoria las líneas del archivo
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));

            // Creo una variable para poder almacenar las líneas del búffer de lectura
            String linea = "";

            // Recorro las diferentes líneas en un bucle
            while( ( linea = br.readLine()) != null){
                System.out.println(linea); // Imprimo las líneas por la  consola
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // LEER ARCHIVOS INTRODUCIENDO TEXTO POR LA CONSOLA
    public void readFilesUsingConsole(){

        // Creo un objeto de tipo File
        File file = new File("mi_carpeta\\ejemplo.txt");

        System.out.println("Introduzaca un texto");

        Scanner sc = new Scanner(System.in);

        try( BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))){
            bw.write(sc.nextLine());
            bw.close();
            System.out.println("Contenido escrito !!");

        }catch (IOException e){
            System.out.println(e.getCause().getMessage());
        }




    }








}
