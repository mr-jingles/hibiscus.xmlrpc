/**********************************************************************
 * $Source: /cvsroot/hibiscus/hibiscus.xmlrpc/src/de/willuhn/jameica/hbci/xmlrpc/server/UeberweisungServiceImpl.java,v $
 * $Revision: 1.2 $
 * $Date: 2006/11/16 22:11:26 $
 * $Author: willuhn $
 * $Locker:  $
 * $State: Exp $
 *
 * Copyright (c) by willuhn.webdesign
 * All rights reserved
 *
 **********************************************************************/

package de.willuhn.jameica.hbci.xmlrpc.server;

import java.rmi.RemoteException;

import de.willuhn.jameica.hbci.rmi.Ueberweisung;
import de.willuhn.jameica.hbci.xmlrpc.rmi.UeberweisungService;

/**
 * Implementierung des Ueberweisung-Service.
 */
public class UeberweisungServiceImpl extends AbstractTransferServiceImpl implements
    UeberweisungService
{

  /**
   * ct.
   * @throws RemoteException
   */
  public UeberweisungServiceImpl() throws RemoteException
  {
    super();
  }


  /**
   * @see de.willuhn.datasource.Service#getName()
   */
  public String getName() throws RemoteException
  {
    return "[xml-rpc] ueberweisung";
  }


  /**
   * @see de.willuhn.jameica.hbci.xmlrpc.server.AbstractTransferServiceImpl#getTransferType()
   */
  Class getTransferType()
  {
    return Ueberweisung.class;
  }

}


/*********************************************************************
 * $Log: UeberweisungServiceImpl.java,v $
 * Revision 1.2  2006/11/16 22:11:26  willuhn
 * @N Added lastschrift support
 *
 * Revision 1.1  2006/11/07 00:18:11  willuhn
 * *** empty log message ***
 *
 **********************************************************************/