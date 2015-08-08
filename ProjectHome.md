# DiVA-omics #

DiVA-omics is a proof-of-concept web-based interactive visual analysis system for the analysis of quantitative omics datasets. It is straightforward to use and does not require any advanced bioinformatics skills.

The unique feature of DiVA-omics is that it supports the analysis of large omics datasets and multiple interactive visualizations of the results, directly in your browser and without having to first download the data.


---


<table border='0'>
<blockquote><tr>
<blockquote><td width='180'><i>Try the DiVA-omics demo!</i></td>
<td width='170'><a href='http://129.177.231.63/diva-omics-demo-3.0/'><img src='http://diva-omics-demo.googlecode.com/svn/wiki/img/button_s.png' /></a></td>
<td width='180'><a href='http://129.177.231.63/diva-omics-demo-3.0/tutorial/diva_tutorial.pdf'>DiVA Tutorial</a></td>
</blockquote></tr>
</table></blockquote>


---


## Main Features ##

  * Analysis and interactive visualizations:
    * Hierarchical clustering
    * Principal component analysis (PCA)
    * Rank product
    * Profile plot
    * Interactive tables
  * Create customized colored sub groups
  * Export the results as text files or high quality images
  * Easy input via tab-separated values files

![http://diva-omics-demo.googlecode.com/svn/wiki/img/Slide4_small.png](http://diva-omics-demo.googlecode.com/svn/wiki/img/Slide4_small.png)


---


## Supported Browsers ##

DiVA has been tested on Chrome, Firefox, Opera, Safari and Internet Explorer. Note that Internet Explorer 11 or newer is required. Using the latest version of all browsers is recommended. It is also strongly recommended to run the browser in full screen mode to get the most out of DiVA.


---


## Example Datasets ##

To display the usability of the system in exploring omics data and extracting biologically meaningful patterns, the online demo includes three example datasets: small (391 rows x 7 columns), medium (5373 rows x 12 columns) and large (26 857 rows x 23 columns), showing that the system maintains its responsiveness even with growing dataset size.

Interesting data points can be selected in the individual plots or tables. The selections are propagated to all the other components, making it straightforward to explore the data from different angles.


---


## System Setup ##

Before you start using the system you need to setup a Java web container that support supports servlet hosting required for GWT deployment. We recommend [Apache Tomcat 7](http://tomcat.apache.org/) or newer with [Java SE 7 JDK or newer](http://www.oracle.com/technetwork/java/javase/downloads/index.html) as main Java web server.

A zipped folder (diva-omics-demo.zip) containing both the WAR file and the DiVA example files is available
[here](https://drive.google.com/file/d/0B1_T5KQIvzHhbVhqU2lNbmlIMUE/view?usp=sharing). The complete code can also be [checked out](https://code.google.com/p/diva-omics-demo/source/checkout) using SVN.

Please also note that you will have to update the path for the divaFiles folder in the deployment-descriptor file (web.xml).

```
<context-param>
    <param-name>
        fileFolder
    </param-name>
    <param-value>
        path to the folder\divaFiles
    </param-value>
</context-param>
```

The web.xml file is located under the WEB-INF folder.

For Maven users please note that some of the jar files are not directly available online and you will therefore have to manually add them to your local Maven repository.

For implementation details please see [DiVA omics main implementation challenges](https://code.google.com/p/diva-omics-demo/wiki/Development).

For further questions about setting up DiVA-omics please do not hesitate to contact the developers.