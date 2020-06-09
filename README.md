# Research on Graph Database and Deep Learning Optical Character Recognition

##  Graph Database
- Study multi-master distributed graph database system that have the ability of billion-level graph
data storage.Verified its feasibility by storing twitter 1.4 billion relational data based on ArangoDB.
- Study the pros and cons of two storage engines of ArangoDb. Concluded that MMFiles allows for
very fast concurrent reads, and RocksDB have the advantage of persistent indexes, read and write
separation.
- Study query, traversal, graph computing performance of different storage engines of ArangoDb.
Experimented with Breadth First Search and pagerank algorithms, and concluded that the mmfile
engine has better performance.
- Study graph computing performance of different architecture of ArangoDb. Experimented with
Breadth First Search and pagerank algorithms in cluster architecture and stand-alone, and con-
cluded that cluster architecture has better performance.
##Research on end-to-end image text recognition based on deep learning
- it contains Docker file and AI model source code.
- Achieved deep learning model collaborative computing based on Nvida-docker container. Used
CPTN and CRNN model to convert unstructured image data into structured Chinese text data.
- Built a CPTN model using Caffe, which can detect Chinese text in the image.
-  Built a CRNN model using pytorch, which can recognize the text in the image.