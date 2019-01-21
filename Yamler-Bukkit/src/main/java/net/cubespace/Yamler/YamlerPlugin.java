package net.cubespace.Yamler;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author geNAZt (fabian.fassbender42@googlemail.com)
 */
public class YamlerPlugin extends JavaPlugin {
    public void onEnable() {
        new Metrics(this);
    }
}
