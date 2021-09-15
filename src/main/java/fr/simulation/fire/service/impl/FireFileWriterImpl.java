package fr.simulation.fire.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.simulation.fire.model.BoxState;
import fr.simulation.fire.service.FireFileWriter;

import java.awt.*;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class FireFileWriterImpl implements FireFileWriter {

    private String outputFilePath = "/home/mounzer/dev/feux/fire/fireBoard.csv";
    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public void write(HashMap<Point, BoxState> board) throws IOException {
        File file = new File(outputFilePath);
        BufferedWriter bf;
        bf = new BufferedWriter(new FileWriter(file));

        try {


            //iterate map entries
            for (Map.Entry<Point, BoxState> entry : board.entrySet()) {

                //put key and value separated by a colon
                bf.write(objectMapper.writeValueAsString(entry.getKey()) + ":" + objectMapper.writeValueAsString(entry.getValue()));

                //new line
                bf.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();

        } finally {

            try {
                //always close the writer
                bf.close();
            } catch (Exception e) {
            }
        }
    }
}


