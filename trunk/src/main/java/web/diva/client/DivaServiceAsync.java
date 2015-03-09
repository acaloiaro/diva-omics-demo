package web.diva.client;

import com.google.gwt.user.client.rpc.AsyncCallback;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;
import web.diva.shared.beans.DivaGroup;
import web.diva.shared.beans.FullDataObject;
import web.diva.shared.beans.InteractiveColumnsResults;
import web.diva.shared.beans.LineChartResults;
import web.diva.shared.beans.PCAImageResult;
import web.diva.shared.beans.RankResult;
import web.diva.shared.beans.SomClustTreeSelectionUpdate;
import web.diva.shared.beans.SomClusteringResult;
//import web.diva.shared.unused.SomClusteringResult;
import web.diva.shared.model.core.model.dataset.DatasetInformation;

/**
 * The async counterpart of <code>GreetingService</code>.
 * @author Yehia Farag
 *
 */
public interface DivaServiceAsync {

    public void getAvailableDatasets(int userTabId,AsyncCallback<TreeMap<Integer, String>> datasetResults);

    public void setMainDataset(int datasetId, AsyncCallback<DatasetInformation> asyncCallback);

    public void computeProfilePlot(double w, double h, AsyncCallback<LineChartResults> asyncCallback);

//    public void computeSomClustering(int datasetId, int linkage, int distanceMeasure, AsyncCallback<SomClusteringResult> asyncCallback);
    public void computeSomClustering(int linkage, int distanceMeasure, boolean clusterColumns,AsyncCallback<SomClusteringResult> asyncCallback);

    
//    public void computeHeatmap(int datasetId, ArrayList<String> indexer, ArrayList<String> colIndexer, AsyncCallback<HeatMapImageResult> asyncCallback);

    public void computeRank(String perm, String seed, List<String> colGropNames, String log2,boolean defaultRank, AsyncCallback<RankResult> asyncCallback);
    
    public void  getDefaultRank( AsyncCallback<RankResult> asyncCallback);

    public void createRowGroup(String name, String color, String type, int[] selection, AsyncCallback<DatasetInformation> asyncCallback);

    public void createColGroup( String name, String color, String type, int[] selection, AsyncCallback<DatasetInformation> asyncCallback);

    public void createSubDataset(String name,String type, int[] selection, AsyncCallback<String> asyncCallback);

    public void updateDatasetInfo(AsyncCallback<DatasetInformation> asyncCallback);

    public void activateGroups(String[] rowGroups, AsyncCallback<DatasetInformation> asyncCallback);

    public void exportData(String rowGroup, AsyncCallback<String> asyncCallback);
    
      public void exportRankingData(int[] indexes,AsyncCallback<String> asyncCallback);
    
      public void exportImgAsPdf(String chartType,String quality, AsyncCallback<String> asyncCallback);
      
      
      public void  exportClusteringAsPdf(String quality, AsyncCallback<String> asyncCallback);

    public void saveDataset( String newName, AsyncCallback<String> asyncCallback);

    public void getGroupsPanelData(AsyncCallback<LinkedHashMap<String, String>[]> asyncCallback);
    
    public void getColGroups(AsyncCallback<List<DivaGroup>> asyncCallback);

    public void updateLineChartSelection(int[] selection, AsyncCallback<String> asyncCallback);

    public void updatePCASelection(int[] selection,AsyncCallback<String> asyncCallback);

    public void computePCA(int comI, int comII, AsyncCallback<PCAImageResult> asyncCallback);

    public void getPCASelection(int startX, int startY, int endX, int endY, AsyncCallback<int[]> asyncCallback);
    
    public void getProfilePlotSelection(int startX, int startY, AsyncCallback<int[]> asyncCallback);

    public void indexToRank(int[] indexes, int type, AsyncCallback<int[]> asyncCallback);
    
    public void  updateSideTree(int x,int y, double w, double h,AsyncCallback<SomClustTreeSelectionUpdate> asyncCallback);
    public void  updateUpperTree(int x,int y, double w, double h,AsyncCallback<SomClustTreeSelectionUpdate> asyncCallback);
    public void updateSomClustInteractiveColumn(int[] selection,AsyncCallback<InteractiveColumnsResults> asyncCallback) ;

     public void  pcaShowAll(boolean showAll,int[] selection,AsyncCallback<String> asyncCallback);
      public void pcaZoomIn(int startX, int startY, int endX, int endY, AsyncCallback<PCAImageResult> asyncCallback);
      public void pcaZoomReset(AsyncCallback<PCAImageResult> asyncCallback);

    public void getReloadData(AsyncCallback<FullDataObject> asyncCallback);
}