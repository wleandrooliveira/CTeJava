/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.controller;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchEvent.Kind;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

/**
 *
 * @author Geraldo Henrique Lacerda Pinto
 */
public class Teste {

    public static void main(String[] args) {
        Path path = Paths.get("C:\\Modified");
        WatchService watchService = null;
        try {
            watchService = FileSystems.getDefault().newWatchService();
            path.register(watchService, StandardWatchEventKinds.ENTRY_CREATE,
                    StandardWatchEventKinds.ENTRY_MODIFY,
                    StandardWatchEventKinds.ENTRY_DELETE);
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        WatchKey key = null;
        while (true) {
            try {
                key = watchService.take();
                for (WatchEvent<?> event : key.pollEvents()) {
                    Kind<?> kind = event.kind();
                    System.out.println("Evento em " + event.context().toString() + " " + kind);
                }
            } catch (Exception e) {
                System.out.println(e.toString());
            }
            boolean reset = key.reset();
            if (!reset) {
                break;
            }
        }
    }
}
