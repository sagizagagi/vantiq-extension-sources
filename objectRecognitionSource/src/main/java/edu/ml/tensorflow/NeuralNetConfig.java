/*
 * Copyright (c) 2018 Vantiq, Inc.
 *
 * All rights reserved.
 *
 * SPDX: MIT
 */

package edu.ml.tensorflow;

import io.vantiq.client.Vantiq;

public class NeuralNetConfig implements Config {

    // General config values for YOLO Processor (alphabetical order)
    // Booleans
    public boolean labelImage;
    public boolean queryResize;
    public boolean saveImage;
    public boolean uploadAsImage;

    // Doubles
    public double[] anchorArray;

    // Floats
    public float threshold;

    // Integers
    public int frameSize;
    public int longEdge;
    public int saveRate;

    // Strings
    public String authToken;
    public String fileName;
    public String labelsFile;
    public String metaFile;
    public String outputDir;
    public String pbFile;
    public String server;
    public String sourceName;

    // Vantiq
    public Vantiq vantiq;

    // Flag to decide if we should use .meta frame size, or default Config frame size
    public boolean useMetaIfAvailable;
    
    public NeuralNetConfig() {
        // Check if user has manually changed the default FRAME_SIZE in Config
        if (FRAME_SIZE == 416) {
            useMetaIfAvailable = true;
        } else {
            useMetaIfAvailable = false;
        }
        
        setFrameSize(FRAME_SIZE);
    }

    // Booleans
    public boolean isLabelImage() {
        return labelImage;
    }

    public void setLabelImage(boolean labelImage) {
        this.labelImage = labelImage;
    }

    public boolean isQueryResize() {
        return queryResize;
    }

    public void setQueryResize(boolean queryResize) {
        this.queryResize = queryResize;
    }

    public boolean isSaveImage() {
        return saveImage;
    }

    public void setSaveImage(boolean saveImage) {
        this.saveImage = saveImage;
    }

    public boolean isUploadAsImage() {
        return uploadAsImage;
    }

    public void setUploadAsImage(boolean uploadAsImage) {
        this.uploadAsImage = uploadAsImage;
    }

    // Doubles
    public double[] getAnchorArray() {
        return anchorArray;
    }

    public void setAnchorArray(double[] anchorArray) {
        this.anchorArray = anchorArray;
    }

    // Floats
    public float getThreshold() {
        return threshold;
    }

    public void setThreshold(float threshold) {
        this.threshold = threshold;
    }

    // Integers
    public int getFrameSize() {
        return frameSize;
    }

    public void setFrameSize(int frameSize) {
        this.frameSize = frameSize;
    }

    public int getLongEdge() {
        return longEdge;
    }

    public void setLongEdge(int longEdge) {
        this.longEdge = longEdge;
    }

    public int getSaveRate() {
        return saveRate;
    }

    public void setSaveRate(int saveRate) {
        this.saveRate = saveRate;
    }

    // Strings
    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getLabelsFile() {
        return labelsFile;
    }

    public void setLabelsFile(String labelsFile) {
        this.labelsFile = labelsFile;
    }

    public String getMetaFile() {
        return metaFile;
    }

    public void setMetaFile(String metaFile) {
        this.metaFile = metaFile;
    }

    public String getOutputDir() {
        return outputDir;
    }

    public void setOutputDir(String outputDir) {
        this.outputDir = outputDir;
    }

    public String getPbFile() {
        return pbFile;
    }

    public void setPbFile(String pbFile) {
        this.pbFile = pbFile;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    // Vantiq
    public Vantiq getVantiq() {
        return vantiq;
    }

    public void setVantiq(Vantiq vantiq) {
        this.vantiq = vantiq;
    }
}
