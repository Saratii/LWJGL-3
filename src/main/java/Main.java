import org.lwjgl.Version;

import static org.lwjgl.glfw.GLFW.glfwInit;

public class Main {

    private static long window;
    private static int width = 1280;
    private static int height = 800;


    public static void main(String[] args) {
        System.out.println(width);
        System.out.println(Version.getVersion());

        glfwInit();
    }
}

