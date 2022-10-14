import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.system.MemoryUtil.*;

public class Main {

    private static long window;
    private static int width = 1280;
    private static int height = 800;


    public static void main(String[] args) {
        System.out.println(width);
        glfwInit();
    }
}

/*error:
[LWJGL] Platform/architecture mismatch detected for module: org.lwjgl
        JVM platform:
        macOS aarch64 17.0.2
        OpenJDK 64-Bit Server VM v17.0.2+8 by Eclipse Adoptium
        Platform available on classpath:
        macos/x64
        [LWJGL] Failed to load a library. Possible solutions:
        a) Add the directory that contains the shared library to -Djava.library.path or -Dorg.lwjgl.librarypath.
        b) Add the JAR that contains the shared library to the classpath.
        [LWJGL] Enable debug mode with -Dorg.lwjgl.util.Debug=true for better diagnostics.
        [LWJGL] Enable the SharedLibraryLoader debug mode with -Dorg.lwjgl.util.DebugLoader=true for better diagnostics.
        Exception in thread "main" java.lang.UnsatisfiedLinkError: Failed to locate library: liblwjgl.dylib
        at org.lwjgl.system.Library.loadSystem(Library.java:164)
        at org.lwjgl.system.Library.loadSystem(Library.java:63)
        at org.lwjgl.system.Library.<clinit>(Library.java:51)
        at org.lwjgl.glfw.GLFW.<clinit>(GLFW.java:30)
        at Main.main(Main.java:14) */
