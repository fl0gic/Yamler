package net.cubespace.Yamler;

import net.md_5.bungee.api.plugin.Plugin;

/**
 * @author geNAZt (fabian.fassbender42@googlemail.com)
 */
public class YamlerPlugin extends Plugin {
    public void onEnable() {
        new Metrics(this);
    }
}
