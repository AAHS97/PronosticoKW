/*
Proyecto Final: Pronostico de Personal
CIA: Kenworth Mexicana
Asignatura: Desarrollo de Software
Catedratico: Maria Angelica Astorga
Equipo: Adrian Heredia, Sergio Salomon, Edgar Pescador, Hector Montes, Jaime Rodriguez
Fecha: Junio 2018.
*/
package kenworthpronostico;

public class jDvistaPrev extends javax.swing.JDialog {

    public jDvistaPrev(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public jDvistaPrev() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLfechaEjecucion = new javax.swing.JLabel();
        jLfechaEjec = new javax.swing.JLabel();
        jLfechaPronostico = new javax.swing.JLabel();
        jlReporteFPronostico = new javax.swing.JLabel();
        jLproduccionActual = new javax.swing.JLabel();
        jLproduccion = new javax.swing.JLabel();
        jLcapacidad = new javax.swing.JLabel();
        jLcapacidadPlanta = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLdetalleProduc = new javax.swing.JLabel();
        jLmodel = new javax.swing.JLabel();
        jLcantidad = new javax.swing.JLabel();
        jLEjes = new javax.swing.JLabel();
        jLejeNeumatico = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLRHactual = new javax.swing.JLabel();
        jLrhReq = new javax.swing.JLabel();
        jLvacaciones = new javax.swing.JLabel();
        jLjubilaciones = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLarea = new javax.swing.JLabel();
        jLmotor = new javax.swing.JLabel();
        jLeje = new javax.swing.JLabel();
        jLcantMotorAct = new javax.swing.JLabel();
        jLcantMotorReq = new javax.swing.JLabel();
        jLcantEjesAct = new javax.swing.JLabel();
        jLcantEjesReq = new javax.swing.JLabel();
        jLvacacionesMotor = new javax.swing.JLabel();
        jLvacacionesEJes = new javax.swing.JLabel();
        jLJubilacionesMotor = new javax.swing.JLabel();
        jLJubilacionesEje = new javax.swing.JLabel();
        lbReporteModelo1 = new javax.swing.JLabel();
        lbReporteModelo2 = new javax.swing.JLabel();
        lbReporteModelo3 = new javax.swing.JLabel();
        lbReporteModelo4 = new javax.swing.JLabel();
        lbReporteModelo5 = new javax.swing.JLabel();
        lbReporteModelo6 = new javax.swing.JLabel();
        lbReporteModelo7 = new javax.swing.JLabel();
        lbReporteCantidad2 = new javax.swing.JLabel();
        lbReporteCantidad3 = new javax.swing.JLabel();
        lbReporteCantidad1 = new javax.swing.JLabel();
        lbReporteMotor1 = new javax.swing.JLabel();
        lbReporteMotor2 = new javax.swing.JLabel();
        lbReporteEjes1 = new javax.swing.JLabel();
        lbReporteEjes2 = new javax.swing.JLabel();
        lbReporteEjesN1 = new javax.swing.JLabel();
        lbReporteEjesN2 = new javax.swing.JLabel();
        lbReporteMotor3 = new javax.swing.JLabel();
        lbReporteMotor4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbReporteCantidad4 = new javax.swing.JLabel();
        lbReporteCantidad5 = new javax.swing.JLabel();
        lbReporteCantidad6 = new javax.swing.JLabel();
        lbReporteCantidad7 = new javax.swing.JLabel();
        lbReporteMotor5 = new javax.swing.JLabel();
        lbReporteMotor6 = new javax.swing.JLabel();
        lbReporteMotor7 = new javax.swing.JLabel();
        lbReporteEjes3 = new javax.swing.JLabel();
        lbReporteEjes4 = new javax.swing.JLabel();
        lbReporteEjes5 = new javax.swing.JLabel();
        lbReporteEjes6 = new javax.swing.JLabel();
        lbReporteEjes7 = new javax.swing.JLabel();
        lbReporteEjesN3 = new javax.swing.JLabel();
        lbReporteEjesN4 = new javax.swing.JLabel();
        lbReporteEjesN5 = new javax.swing.JLabel();
        lbReporteEjesN6 = new javax.swing.JLabel();
        lbReporteEjesN7 = new javax.swing.JLabel();
        lbdifMotores = new javax.swing.JLabel();
        lbdifEjes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kenworthsimulator/Kenworth-3.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Reporte");

        jLfechaEjecucion.setText("Fecha de Ejecución");

        jLfechaEjec.setText("Fecha");

        jLfechaPronostico.setText("Fecha de Pronóstico");

        jlReporteFPronostico.setText("Fecha");

        jLproduccionActual.setText("Producción Actual:");

        jLproduccion.setText("57");

        jLcapacidad.setText("Capacidad Planta:");

        jLcapacidadPlanta.setText("100");

        jLdetalleProduc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLdetalleProduc.setText("Detalle Producción");

        jLmodel.setText("Modelos");

        jLcantidad.setText("Cantidad");

        jLEjes.setText("Ejes");

        jLejeNeumatico.setText("Eje Neumático");

        jLRHactual.setText("Recurso Humano Actual");

        jLrhReq.setText("Recurso Humano Requerido");

        jLvacaciones.setText("Vacaciones");

        jLjubilaciones.setText("Jubilaciones");

        jLarea.setText("Área");

        jLmotor.setText("Motores");

        jLeje.setText("Ejes");

        jLcantMotorAct.setText("26");

        jLcantMotorReq.setText("35");

        jLcantEjesAct.setText("15");

        jLcantEjesReq.setText("20");

        jLvacacionesMotor.setText("5");

        jLvacacionesEJes.setText("2");

        jLJubilacionesMotor.setText("0");

        jLJubilacionesEje.setText("1");

        lbReporteModelo1.setText("lbReporteModelo1");

        lbReporteModelo2.setText("lbReporteModelo1");

        lbReporteModelo3.setText("lbReporteModelo1");

        lbReporteModelo4.setText("lbReporteModelo1");

        lbReporteModelo5.setText("lbReporteModelo1");

        lbReporteModelo6.setText("lbReporteModelo1");

        lbReporteModelo7.setText("lbReporteModelo1");

        lbReporteCantidad2.setText("jLabel3");

        lbReporteCantidad3.setText("jLabel3");

        lbReporteCantidad1.setText("jLabel3");

        lbReporteMotor1.setText("jLabel3");
        lbReporteMotor1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lbReporteMotor2.setText("jLabel3");
        lbReporteMotor2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lbReporteEjes1.setText("jLabel3");

        lbReporteEjes2.setText("jLabel3");

        lbReporteEjesN1.setText("jLabel3");

        lbReporteEjesN2.setText("jLabel3");

        lbReporteMotor3.setText("jLabel3");
        lbReporteMotor3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lbReporteMotor4.setText("jLabel3");
        lbReporteMotor4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel3.setText("Motor");

        lbReporteCantidad4.setText("jLabel3");

        lbReporteCantidad5.setText("jLabel3");

        lbReporteCantidad6.setText("jLabel3");

        lbReporteCantidad7.setText("jLabel3");

        lbReporteMotor5.setText("jLabel3");
        lbReporteMotor5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lbReporteMotor6.setText("jLabel3");
        lbReporteMotor6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lbReporteMotor7.setText("jLabel3");
        lbReporteMotor7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lbReporteEjes3.setText("jLabel3");

        lbReporteEjes4.setText("jLabel3");

        lbReporteEjes5.setText("jLabel3");

        lbReporteEjes6.setText("jLabel3");

        lbReporteEjes7.setText("jLabel3");

        lbReporteEjesN3.setText("jLabel3");

        lbReporteEjesN4.setText("jLabel3");

        lbReporteEjesN5.setText("jLabel3");

        lbReporteEjesN6.setText("jLabel3");

        lbReporteEjesN7.setText("jLabel3");

        lbdifMotores.setText("20");

        lbdifEjes.setText("20");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLdetalleProduc)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLmodel)
                                        .addGap(85, 85, 85))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbReporteModelo1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, Short.MAX_VALUE)
                                            .addComponent(lbReporteModelo2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                            .addComponent(lbReporteModelo3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                            .addComponent(lbReporteModelo4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                            .addComponent(lbReporteModelo5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                            .addComponent(lbReporteModelo6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                            .addComponent(lbReporteModelo7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                        .addGap(65, 65, 65)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbReporteCantidad7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbReporteMotor7))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lbReporteCantidad6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbReporteMotor6))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lbReporteCantidad5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbReporteMotor5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbReporteCantidad3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbReporteMotor3))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lbReporteCantidad2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbReporteMotor2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLcantidad)
                                            .addComponent(lbReporteCantidad1))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(36, 36, 36)
                                                .addComponent(lbReporteMotor1))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(28, 28, 28)
                                                .addComponent(jLabel3))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lbReporteCantidad4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbReporteMotor4)))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLEjes)
                                    .addComponent(lbReporteEjes1)
                                    .addComponent(lbReporteEjes2)
                                    .addComponent(lbReporteEjes3)
                                    .addComponent(lbReporteEjes4)
                                    .addComponent(lbReporteEjes5)
                                    .addComponent(lbReporteEjes6)
                                    .addComponent(lbReporteEjes7))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbReporteEjesN7)
                                    .addComponent(lbReporteEjesN6)
                                    .addComponent(lbReporteEjesN5)
                                    .addComponent(lbReporteEjesN4)
                                    .addComponent(lbReporteEjesN3)
                                    .addComponent(lbReporteEjesN2)
                                    .addComponent(lbReporteEjesN1)
                                    .addComponent(jLejeNeumatico)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(57, 57, 57)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLfechaEjecucion)
                                                    .addComponent(jLfechaPronostico))
                                                .addGap(115, 115, 115)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLcapacidad)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jLcapacidadPlanta))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLproduccionActual)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jLproduccion))))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(76, 76, 76)
                                        .addComponent(jLfechaEjec))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(79, 79, 79)
                                        .addComponent(jlReporteFPronostico))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLjubilaciones)
                                        .addGap(106, 106, 106))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLRHactual)
                                            .addComponent(jLrhReq)
                                            .addComponent(jLvacaciones))
                                        .addGap(125, 125, 125)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLmotor)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jLJubilacionesMotor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLcantMotorReq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLcantMotorAct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLvacacionesMotor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(lbdifMotores)))
                                        .addGap(72, 72, 72)))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLcantEjesAct, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLcantEjesReq)
                                                .addComponent(jLvacacionesEJes, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLJubilacionesEje, javax.swing.GroupLayout.Alignment.TRAILING)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lbdifEjes))
                                    .addComponent(jLeje))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(61, 61, 61))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
                        .addComponent(jSeparator2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLarea)
                        .addGap(175, 175, 175))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLfechaEjecucion)
                            .addComponent(jLproduccionActual)
                            .addComponent(jLproduccion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLfechaEjec)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLfechaPronostico)
                            .addComponent(jLcapacidad)
                            .addComponent(jLcapacidadPlanta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlReporteFPronostico))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLdetalleProduc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLmodel)
                    .addComponent(jLEjes)
                    .addComponent(jLejeNeumatico)
                    .addComponent(jLcantidad)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbReporteCantidad1)
                        .addComponent(lbReporteMotor1)
                        .addComponent(lbReporteEjes1)
                        .addComponent(lbReporteEjesN1))
                    .addComponent(lbReporteModelo1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbReporteModelo2)
                    .addComponent(lbReporteCantidad2)
                    .addComponent(lbReporteMotor2)
                    .addComponent(lbReporteEjes2)
                    .addComponent(lbReporteEjesN2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbReporteCantidad3)
                        .addComponent(lbReporteMotor3)
                        .addComponent(lbReporteEjes3)
                        .addComponent(lbReporteEjesN3))
                    .addComponent(lbReporteModelo3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbReporteModelo4)
                    .addComponent(lbReporteMotor4)
                    .addComponent(lbReporteCantidad4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbReporteEjes4)
                        .addComponent(lbReporteEjesN4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbReporteModelo5)
                            .addComponent(lbReporteCantidad5)
                            .addComponent(lbReporteMotor5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbReporteModelo6)
                                    .addComponent(lbReporteCantidad6)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbReporteEjes6)
                                        .addComponent(lbReporteEjesN6)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbReporteModelo7)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(lbReporteEjes7)
                                                .addComponent(lbReporteEjesN7)))
                                        .addGap(45, 45, 45)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLarea)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLmotor)
                                            .addComponent(jLeje))
                                        .addGap(9, 9, 9)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLRHactual)
                                            .addComponent(jLcantMotorAct)
                                            .addComponent(jLcantEjesAct))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLrhReq)
                                            .addComponent(jLcantMotorReq)
                                            .addComponent(jLcantEjesReq)
                                            .addComponent(lbdifMotores)
                                            .addComponent(lbdifEjes))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLvacaciones)
                                            .addComponent(jLvacacionesMotor)
                                            .addComponent(jLvacacionesEJes))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLjubilaciones)
                                            .addComponent(jLJubilacionesMotor)
                                            .addComponent(jLJubilacionesEje)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbReporteCantidad7)
                                        .addComponent(lbReporteMotor7))))
                            .addComponent(lbReporteMotor6)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbReporteEjes5)
                        .addComponent(lbReporteEjesN5)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jDvistaPrev.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jDvistaPrev.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jDvistaPrev.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jDvistaPrev.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                jDvistaPrev dialog = new jDvistaPrev(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLEjes;
    public javax.swing.JLabel jLJubilacionesEje;
    public javax.swing.JLabel jLJubilacionesMotor;
    private javax.swing.JLabel jLRHactual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLarea;
    public javax.swing.JLabel jLcantEjesAct;
    public javax.swing.JLabel jLcantEjesReq;
    public javax.swing.JLabel jLcantMotorAct;
    public javax.swing.JLabel jLcantMotorReq;
    private javax.swing.JLabel jLcantidad;
    private javax.swing.JLabel jLcapacidad;
    public javax.swing.JLabel jLcapacidadPlanta;
    private javax.swing.JLabel jLdetalleProduc;
    private javax.swing.JLabel jLeje;
    private javax.swing.JLabel jLejeNeumatico;
    public javax.swing.JLabel jLfechaEjec;
    private javax.swing.JLabel jLfechaEjecucion;
    private javax.swing.JLabel jLfechaPronostico;
    private javax.swing.JLabel jLjubilaciones;
    private javax.swing.JLabel jLmodel;
    private javax.swing.JLabel jLmotor;
    public javax.swing.JLabel jLproduccion;
    private javax.swing.JLabel jLproduccionActual;
    private javax.swing.JLabel jLrhReq;
    private javax.swing.JLabel jLvacaciones;
    public javax.swing.JLabel jLvacacionesEJes;
    public javax.swing.JLabel jLvacacionesMotor;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    public javax.swing.JLabel jlReporteFPronostico;
    public javax.swing.JLabel lbReporteCantidad1;
    public javax.swing.JLabel lbReporteCantidad2;
    public javax.swing.JLabel lbReporteCantidad3;
    public javax.swing.JLabel lbReporteCantidad4;
    public javax.swing.JLabel lbReporteCantidad5;
    public javax.swing.JLabel lbReporteCantidad6;
    public javax.swing.JLabel lbReporteCantidad7;
    public javax.swing.JLabel lbReporteEjes1;
    public javax.swing.JLabel lbReporteEjes2;
    public javax.swing.JLabel lbReporteEjes3;
    public javax.swing.JLabel lbReporteEjes4;
    public javax.swing.JLabel lbReporteEjes5;
    public javax.swing.JLabel lbReporteEjes6;
    public javax.swing.JLabel lbReporteEjes7;
    public javax.swing.JLabel lbReporteEjesN1;
    public javax.swing.JLabel lbReporteEjesN2;
    public javax.swing.JLabel lbReporteEjesN3;
    public javax.swing.JLabel lbReporteEjesN4;
    public javax.swing.JLabel lbReporteEjesN5;
    public javax.swing.JLabel lbReporteEjesN6;
    public javax.swing.JLabel lbReporteEjesN7;
    public javax.swing.JLabel lbReporteModelo1;
    public javax.swing.JLabel lbReporteModelo2;
    public javax.swing.JLabel lbReporteModelo3;
    public javax.swing.JLabel lbReporteModelo4;
    public javax.swing.JLabel lbReporteModelo5;
    public javax.swing.JLabel lbReporteModelo6;
    public javax.swing.JLabel lbReporteModelo7;
    public javax.swing.JLabel lbReporteMotor1;
    public javax.swing.JLabel lbReporteMotor2;
    public javax.swing.JLabel lbReporteMotor3;
    public javax.swing.JLabel lbReporteMotor4;
    public javax.swing.JLabel lbReporteMotor5;
    public javax.swing.JLabel lbReporteMotor6;
    public javax.swing.JLabel lbReporteMotor7;
    public javax.swing.JLabel lbdifEjes;
    public javax.swing.JLabel lbdifMotores;
    // End of variables declaration//GEN-END:variables
}