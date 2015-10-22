package xyz.deepzeafish;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DoStuff {
    @Autowired
    private MyConfig myConfig;

    public void doSomeStuff() {
	System.out.println("using env:" + myConfig.getEnv());
	System.out.println("name:" + myConfig.getName());
	System.out.println("servers:" + myConfig.getServers());
	System.out.println("numbers:" + myConfig.getNumbers());
    }
}
