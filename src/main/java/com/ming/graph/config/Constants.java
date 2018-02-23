package com.ming.graph.config;

import com.ming.graph.model.Edge;
import com.ming.graph.model.Node;
import edu.uci.ics.jung.graph.Graph;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: bbrighttaer
 * Date: 2/7/2018
 * Time: 5:20 PM
 * Project: GraphProject
 */
public class Constants {
    public static Map<Graph<Node, Edge>, String> graphMetadataMap = new HashMap<>();
    public static final String GRAPH_XSD_PKG = "com.ming.graph.xsd";
    public static final Map<String, String> GRAPH_KEYS = new HashMap<>();
    public static final String GRAPH_FOLDER_NAME = "data_streets";
    public static final int BASE_GRAPH_INDEX = 0;
}