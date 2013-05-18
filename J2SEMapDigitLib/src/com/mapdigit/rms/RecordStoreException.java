//------------------------------------------------------------------------------
//                         COPYRIGHT 2010 GUIDEBEE
//                           ALL RIGHTS RESERVED.
//                     GUIDEBEE CONFIDENTIAL PROPRIETARY
///////////////////////////////////// REVISIONS ////////////////////////////////
// Date       Name                 Tracking #         Description
// ---------  -------------------  ----------         --------------------------
// 09SEP2010  James Shen                 	      Code Review
////////////////////////////////////////////////////////////////////////////////
//--------------------------------- PACKAGE ------------------------------------
package com.mapdigit.rms;

//--------------------------------- IMPORTS ------------------------------------
//[------------------------------ MAIN CLASS ----------------------------------]
////////////////////////////////////////////////////////////////////////////////
//--------------------------------- REVISIONS ----------------------------------
// Date       Name                 Tracking #         Description
// --------   -------------------  -------------      --------------------------
// 09SEP2010  James Shen                 	          Initial Creation
////////////////////////////////////////////////////////////////////////////////
/**
 * Thrown to indicate a general exception occurred in a record store operation. 
 * <p>
 * <hr><b>&copy; Copyright 2010 Guidebee, Inc. All Rights Reserved.</b>
 * @version     1.00, 09/09/10
 * @author      Guidebee, Inc.
 */
public class RecordStoreException extends Exception {

    ////////////////////////////////////////////////////////////////////////////
    //--------------------------------- REVISIONS ------------------------------
    // Date       Name                 Tracking #         Description
    // ---------  -------------------  -------------      ----------------------
    // 09SEP2010  James Shen                 	          Initial Creation
    ////////////////////////////////////////////////////////////////////////////
    /**
     * constructor.
     * @param message
     */
    public RecordStoreException(String message) {
        super(message);
    }

    ////////////////////////////////////////////////////////////////////////////
    //--------------------------------- REVISIONS ------------------------------
    // Date       Name                 Tracking #         Description
    // ---------  -------------------  -------------      ----------------------
    // 09SEP2010  James Shen                 	          Initial Creation
    ////////////////////////////////////////////////////////////////////////////
    /**
     * default constructor.
     */
    public RecordStoreException() {
        super();
    }
}

