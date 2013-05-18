//------------------------------------------------------------------------------
//                         COPYRIGHT 2011 GUIDEBEE
//                           ALL RIGHTS RESERVED.
//                     GUIDEBEE CONFIDENTIAL PROPRIETARY
///////////////////////////////////// REVISIONS ////////////////////////////////
// Date       Name                 Tracking #         Description
// ---------  -------------------  ----------         --------------------------
// 24JAN2011  James Shen                 	      Code review
////////////////////////////////////////////////////////////////////////////////
//--------------------------------- PACKAGE ------------------------------------
package com.mapdigit.gis.raster;

//[------------------------------ MAIN CLASS ----------------------------------]
////////////////////////////////////////////////////////////////////////////////
//--------------------------------- REVISIONS ----------------------------------
// Date       Name                 Tracking #         Description
// --------   -------------------  -------------      --------------------------
// 24JAN2011  James Shen                 	      Code review
////////////////////////////////////////////////////////////////////////////////
/**
 * Defines the map types and relations between map types.
 * <hr>
 * <hr><b>&copy; Copyright 2011 Guidebee Pty Ltd. All Rights Reserved.</b>
 * @version     2.00, 24/01/11
 * @author      Guidebee Pty Ltd.
 */
public interface ICustomMapType {

    ////////////////////////////////////////////////////////////////////////////
    //--------------------------------- REVISIONS ------------------------------
    // Date       Name                 Tracking #         Description
    // ---------  -------------------  -------------      ----------------------
    // 24JAN2011  James Shen                 	          Code review
    ////////////////////////////////////////////////////////////////////////////
    /**
     * Get url based on type, x,y,z
     */
    public String getTileURL(int mtype, int x, int y, int zoomLevel);

}
