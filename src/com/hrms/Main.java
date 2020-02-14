package com.hrms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import java.awt.Toolkit;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Main extends JFrame {

	private JPanel contentPane;
	private JDesktopPane desktopPane;
	private JButton btnNew;
	private Form1 form1;
	private Step_1 step_1;
	private Step_2 step_2;
	private Step_3 step_3;
	private Add_Medical_Treatments add_Medical_Treatments;
	private Edit_Medical_Treatments_Records edit_Medical_Treatments_Records;
	private View_Overall_Patient_Bill view_Overall_Patient_Bill;
	private Discharge_Patient discharge_Patient;
	private Outpatients_Maintenance outpatients_Maintenance;
	private Add_ServicTreatments add_ServicTreatments;
	private Edit_Servic_Treatments_Report edit_Servic_Treatments_Report;
	private Add_Medical_Treatments1 add_Medical_Treatments1;
	private Edit_Medical_Treatments1 edit_Medical_Treatments1;
	private View_Overall_Patient_Bill1 view_Overall_Patient_Bill1;
	private Manage_Appointments manage_Appointments;
	private Manage_Patient_Bill manage_Patient_Bill;
	private Serch_Payments serch_Payments;
	private Serch_Payments1 serch_Payments1;
	private Manage_Patient_Bill1 manage_Patient_Bill1;
	private Inpatients_Master_report inpatients_Master_report;
	private Outpatients_Master_Report outpatients_Master_Report;
	private Channeling_Patients_Master_Reports1 channeling_Patients_Master_Reports1;
	private Patient_Admission_Master_Report patient_Admission_Master_Report;
	private Patient_Discharge_Maste_Report patient_Discharge_Maste_Report;
	private Doctors_Visits_Master_report doctors_Visits_Master_report;
	private Inpatients inpatients;
	private Outpatients outpatients;
	private Inpatients1 inpatients1;
	private Outpatients1 outpatients1;
	private Doctors_Master_Reports doctors_Master_Reports;
	private Doctors_Chancling_Schedul_Report doctors_Chancling_Schedul_Report;
	private All_Companies_Maste_Report all_Companies_Maste_Report;
	private Inpatients2 inpatients2;
	private Outpatients2 outpatients2;
	private Medicine_Master_Report medicine_Master_Report;
	private Medical_Services_Master_Report medical_Services_Master_Report;
	private Department_Master_Reports department_Master_Reports;
	private Rooms_Master_Reports rooms_Master_Reports;
	private Inpatients_Invoice inpatients_Invoice;
	private Inpatient_Revenue_Reports inpatient_Revenue_Reports;
	private Outpatients_Revenue_Reports outpatients_Revenue_Reports;
	private Docter_Earning_Reports docter_Earning_Reports;
	private Bill_Status_Reports bill_Status_Reports;
	private Doctors_Maintenance doctors_Maintenance;
	private Docters_Schedules_Maintenance docters_Schedules_Maintenance;
	private Medicines_Maintenance medicines_Maintenance;
	private Hospital_Services_Maintenance hospital_Services_Maintenance;
	private Departments_Maintenance departments_Maintenance;
	private Wards_Maintenance wards_Maintenance;
	private Rooms_Maintenance rooms_Maintenance;
	private Corporate_Maintenance corporate_Maintenance;
	private Manage_User_Accounts manage_User_Accounts;
	private Change_Password change_Password;
	private About about;
	private Help_File help_File;
	private JMenuItem mntmStepInpatient;
	private JMenuItem mntmStepGuardeans;
	private JMenuItem mntmStepRegister;
	private JMenuItem mntmAddMedicalTreatments;
	private JMenuItem mntmEditMedicalTreatments;
	private JMenuItem mntmViewOverallPatient;
	private JMenuItem mntmDischargePatient;
	private JMenuItem mntmOutpatientsMaintenance;
	private JMenuItem mntmAddServictreatments;
	private JMenuItem mntmEditServicTreatments;
	private JMenuItem mntmAddMedicalTreatments_1;
	private JMenuItem mntmEditMedicalTreatments_1;
	private JMenuItem mntmViewOverallPatient_1;
	private JMenuItem mntmManageAppointments;
	private JMenuItem mntmManagePatientBill;
	private JMenuItem mntmSerchPayments;
	private JMenuItem mntmSerchPayments_1;
	private JMenuItem mntmManagePatientBill_1;
	private JMenuItem mntmInpatientsMasterReport;
	private JMenuItem mntmOutpatientsMasterReport;
	private JMenuItem mntmChannelingPatientsMaster;
	private JMenuItem mntmPatientAdmissionMaster;
	private JMenuItem mntmPatientDischargeMaster;
	private JMenuItem mntmDoctorsVisitsMaster;
	private JMenuItem mntmInpatients;
	private JMenuItem mntmOutpatients_2;
	private JMenuItem mntmInpatients_1;
	private JMenuItem mntmOutpatients;
	private JMenuItem mntmDoctorsMasterReports;
	private JMenuItem mntmDoctorsChanclingSchedul;
	private JMenuItem mntmAllCompaniesMaster;
	private JMenuItem mntmInpatient;
	private JMenuItem mntmOutpatients_1;
	private JMenuItem mntmMedicineMasterReport;
	private JMenuItem mntmMedicalServicesMaster;
	private JMenuItem mntmDepartmentMasterReports;
	private JMenuItem mntmRoomsMasterReports;
	private JMenuItem mntmInpatientsInvoice;
	private JMenuItem mntmInpatientRevenueReports;
	private JMenuItem mntmOutpatientsRevenueReports;
	private JMenuItem mntmDocterEarningReports;
	private JMenuItem mntmBillStatusReports;
	private JMenuItem mntmDoctorsMaintenance;
	private JMenuItem mntmDoctersSchedulesMaintenance;
	private JMenuItem mntmMedicinesMaintenance;
	private JMenuItem mntmHospitalServicesMaintenance;
	private JMenuItem mntmDepartmentsMaintenance;
	private JMenuItem mntmWardsMaintenance;
	private JMenuItem mntmRoomsMaintenance;
	private JMenuItem mntmCorporateMaintenance;
	private JMenuItem mntmManageUserAccounts;
	private JMenuItem mntmChangePassword;
	private JMenuItem mntmAbout;
	private JMenuItem mntmHelpFile;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Main() {
		initComponent();
		createEvents();
	}

	/**
	 * Create the frame.
	 */
	private void initComponent() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				Main.class.getResource("")));
		setTitle("Hospital Management System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1301, 720);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnFile = new JMenu("File");
		mnFile.setIcon(new ImageIcon(Main.class
				.getResource("/image_Icon/File.jpg")));
		menuBar.add(mnFile);

		JMenuItem mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);

		JMenu mnInpatient = new JMenu("Inpatients");
		mnInpatient.setIcon(new ImageIcon(Main.class
				.getResource("/image_Icon/patient.png")));
		menuBar.add(mnInpatient);

		JMenu mnPatientAdmission = new JMenu("Patient Admission");
		mnInpatient.add(mnPatientAdmission);

		mntmStepInpatient = new JMenuItem("Step-1 : In-patient Maintenance");

		mnPatientAdmission.add(mntmStepInpatient);

		mntmStepGuardeans = new JMenuItem("Step-2 : Guardeans Maintenance");

		mnPatientAdmission.add(mntmStepGuardeans);

		mntmStepRegister = new JMenuItem("Step-3 : Register / Admit Patient");

		mnPatientAdmission.add(mntmStepRegister);

		JMenu mnTreatments = new JMenu("Treatments");
		mnInpatient.add(mnTreatments);

		JMenu mnMedicalTreatementsMaintenance = new JMenu(
				"Medical Treatements Maintenance");
		mnTreatments.add(mnMedicalTreatementsMaintenance);

		mntmAddMedicalTreatments = new JMenuItem("Add Medical Treatments");

		mnMedicalTreatementsMaintenance.add(mntmAddMedicalTreatments);

		mntmEditMedicalTreatments = new JMenuItem(
				"Edit Medical Treatments Records");

		mnMedicalTreatementsMaintenance.add(mntmEditMedicalTreatments);

		mntmViewOverallPatient = new JMenuItem("View Overall Patient Bill");

		mnInpatient.add(mntmViewOverallPatient);

		mntmDischargePatient = new JMenuItem("Discharge Patient");

		mnInpatient.add(mntmDischargePatient);

		JMenu mnOutpatients = new JMenu("Outpatients");
		mnOutpatients.setIcon(new ImageIcon(Main.class
				.getResource("/image_Icon/patient.png")));
		menuBar.add(mnOutpatients);

		mntmOutpatientsMaintenance = new JMenuItem("Outpatients Maintenance");

		mnOutpatients.add(mntmOutpatientsMaintenance);

		JMenu mnTreatments_1 = new JMenu("Treatments");
		mnTreatments_1.setIcon(new ImageIcon(Main.class
				.getResource("/image_Icon/Treatments.png")));
		mnOutpatients.add(mnTreatments_1);

		JMenu mnServicTreatmentMaintenance = new JMenu(
				"Servic Treatment Maintenance");
		mnTreatments_1.add(mnServicTreatmentMaintenance);

		mntmAddServictreatments = new JMenuItem("Add ServicTreatments");

		mnServicTreatmentMaintenance.add(mntmAddServictreatments);

		mntmEditServicTreatments = new JMenuItem(
				"Edit Servic Treatments Report");

		mnServicTreatmentMaintenance.add(mntmEditServicTreatments);

		JMenu mnMedicalTreatmentsMaintenance = new JMenu(
				"Medical Treatments Maintenance");
		mnTreatments_1.add(mnMedicalTreatmentsMaintenance);

		mntmAddMedicalTreatments_1 = new JMenuItem("Add Medical Treatments");

		mnMedicalTreatmentsMaintenance.add(mntmAddMedicalTreatments_1);

		mntmEditMedicalTreatments_1 = new JMenuItem("Edit Medical Treatments");

		mnMedicalTreatmentsMaintenance.add(mntmEditMedicalTreatments_1);

		mntmViewOverallPatient_1 = new JMenuItem("View Overall Patient Bill");

		mnOutpatients.add(mntmViewOverallPatient_1);

		JMenu mnChanneling = new JMenu("Channeling");
		mnChanneling.setIcon(new ImageIcon(Main.class
				.getResource("/image_Icon/Treatments.png")));
		menuBar.add(mnChanneling);

		mntmManageAppointments = new JMenuItem("Manage Appointments");

		mnChanneling.add(mntmManageAppointments);

		JMenu mnPayments = new JMenu("Payments");
		mnPayments.setIcon(new ImageIcon(Main.class
				.getResource("/image_Icon/payment.jpg")));
		menuBar.add(mnPayments);

		JMenu mnInpatient_1 = new JMenu("Inpatient");
		mnPayments.add(mnInpatient_1);

		mntmManagePatientBill = new JMenuItem("Manage Patient Bill");
		mnInpatient_1.add(mntmManagePatientBill);

		mntmSerchPayments = new JMenuItem("Serch Payments");

		mnInpatient_1.add(mntmSerchPayments);

		JMenu mnOutpatient = new JMenu("Outpatient");
		mnOutpatient.setIcon(new ImageIcon(Main.class
				.getResource("/image_Icon/patient.png")));
		mnPayments.add(mnOutpatient);

		mntmSerchPayments_1 = new JMenuItem("Serch Payments");

		mnOutpatient.add(mntmSerchPayments_1);

		mntmManagePatientBill_1 = new JMenuItem("Manage Patient Bill");

		mnOutpatient.add(mntmManagePatientBill_1);

		JMenu mnReports = new JMenu("Reports");
		mnReports.setIcon(new ImageIcon(Main.class
				.getResource("/image_Icon/patient.png")));
		menuBar.add(mnReports);

		JMenu mnPatientsReports = new JMenu("Patients Reports");
		mnReports.add(mnPatientsReports);

		mntmInpatientsMasterReport = new JMenuItem("Inpatients Master report");

		mnPatientsReports.add(mntmInpatientsMasterReport);

		mntmOutpatientsMasterReport = new JMenuItem("Outpatients Master Report");

		mnPatientsReports.add(mntmOutpatientsMasterReport);

		mntmChannelingPatientsMaster = new JMenuItem(
				"Channeling Patients Master Reports");

		mnPatientsReports.add(mntmChannelingPatientsMaster);

		mntmPatientAdmissionMaster = new JMenuItem(
				"Patient Admission Master Report");

		mnPatientsReports.add(mntmPatientAdmissionMaster);

		mntmPatientDischargeMaster = new JMenuItem(
				"Patient Discharge Master Report");

		mnPatientsReports.add(mntmPatientDischargeMaster);

		mntmDoctorsVisitsMaster = new JMenuItem("Doctors Visits Master report");

		mnPatientsReports.add(mntmDoctorsVisitsMaster);

		JMenu mnPatientsMedicalTreatments = new JMenu(
				"Patients Medical Treatments Master Report");
		mnPatientsReports.add(mnPatientsMedicalTreatments);

		mntmInpatients = new JMenuItem("Inpatients");

		mnPatientsMedicalTreatments.add(mntmInpatients);

		mntmOutpatients_2 = new JMenuItem("Outpatients");

		mnPatientsMedicalTreatments.add(mntmOutpatients_2);

		JMenu mnPatientsMedicalServices = new JMenu(
				"Patients Medical Services Master Report");
		mnPatientsReports.add(mnPatientsMedicalServices);

		mntmInpatients_1 = new JMenuItem("Inpatients");

		mnPatientsMedicalServices.add(mntmInpatients_1);

		mntmOutpatients = new JMenuItem("Outpatients");

		mnPatientsMedicalServices.add(mntmOutpatients);

		JMenu mnDocterReports = new JMenu("Docter Reports");
		mnReports.add(mnDocterReports);

		mntmDoctorsMasterReports = new JMenuItem("Doctors Master Reports");

		mnDocterReports.add(mntmDoctorsMasterReports);

		mntmDoctorsChanclingSchedul = new JMenuItem(
				"Doctor's Chancling Schedul Report");

		mnDocterReports.add(mntmDoctorsChanclingSchedul);

		JMenu mnCorporateReports = new JMenu("Corporate Reports");
		mnReports.add(mnCorporateReports);

		mntmAllCompaniesMaster = new JMenuItem("All Companies Master Report");

		mnCorporateReports.add(mntmAllCompaniesMaster);

		JMenu mnCompaniesPatientsReport = new JMenu(
				"Companies Patients Report By Division");
		mnCorporateReports.add(mnCompaniesPatientsReport);

		mntmInpatient = new JMenuItem("Inpatients");

		mnCompaniesPatientsReport.add(mntmInpatient);

		mntmOutpatients_1 = new JMenuItem("Outpatients");

		mnCompaniesPatientsReport.add(mntmOutpatients_1);

		JMenu mnHospitalReports = new JMenu("Hospital Reports");
		mnReports.add(mnHospitalReports);

		mntmMedicineMasterReport = new JMenuItem("Medicine Master Report");

		mnHospitalReports.add(mntmMedicineMasterReport);

		mntmMedicalServicesMaster = new JMenuItem(
				"Medical Services Master Report");

		mnHospitalReports.add(mntmMedicalServicesMaster);

		mntmDepartmentMasterReports = new JMenuItem("Department Master Reports");

		mnHospitalReports.add(mntmDepartmentMasterReports);

		mntmRoomsMasterReports = new JMenuItem("Rooms Master Reports");

		mnHospitalReports.add(mntmRoomsMasterReports);

		JMenu mnRevenueReports = new JMenu("Revenue Reports");
		mnReports.add(mnRevenueReports);

		mntmInpatientsInvoice = new JMenuItem("Inpatients Invoice");
		mnRevenueReports.add(mntmInpatientsInvoice);

		mntmInpatientRevenueReports = new JMenuItem("Inpatient Revenue Reports");

		mnRevenueReports.add(mntmInpatientRevenueReports);

		mntmOutpatientsRevenueReports = new JMenuItem(
				"Outpatients Revenue Reports");

		mnRevenueReports.add(mntmOutpatientsRevenueReports);

		mntmDocterEarningReports = new JMenuItem("Docter Earning Reports");

		mnRevenueReports.add(mntmDocterEarningReports);

		mntmBillStatusReports = new JMenuItem("Bill Status Reports");

		mnRevenueReports.add(mntmBillStatusReports);

		JMenu mnMaintenance = new JMenu("Maintenance");
		menuBar.add(mnMaintenance);

		JMenu mnDocterMaintenance = new JMenu("Docter Maintenance");
		mnMaintenance.add(mnDocterMaintenance);

		mntmDoctorsMaintenance = new JMenuItem("Doctor's Maintenance");

		mnDocterMaintenance.add(mntmDoctorsMaintenance);

		mntmDoctersSchedulesMaintenance = new JMenuItem(
				"Docter's Schedules Maintenance");

		mnDocterMaintenance.add(mntmDoctersSchedulesMaintenance);

		mntmMedicinesMaintenance = new JMenuItem("Medicines Maintenance");

		mnMaintenance.add(mntmMedicinesMaintenance);

		mntmHospitalServicesMaintenance = new JMenuItem(
				"Hospital Services Maintenance");

		mnMaintenance.add(mntmHospitalServicesMaintenance);

		mntmDepartmentsMaintenance = new JMenuItem("Departments Maintenance");

		mnMaintenance.add(mntmDepartmentsMaintenance);

		mntmWardsMaintenance = new JMenuItem("Wards Maintenance");

		mnMaintenance.add(mntmWardsMaintenance);

		mntmRoomsMaintenance = new JMenuItem("Rooms Maintenance");

		mnMaintenance.add(mntmRoomsMaintenance);

		mntmCorporateMaintenance = new JMenuItem("Corporate Maintenance");

		mnMaintenance.add(mntmCorporateMaintenance);

		JMenu mnUserAccount = new JMenu("User Account");
		mnUserAccount.setIcon(new ImageIcon(Main.class
				.getResource("/image_Icon/patient.png")));
		menuBar.add(mnUserAccount);

		mntmManageUserAccounts = new JMenuItem("Manage User Accounts");

		mnUserAccount.add(mntmManageUserAccounts);

		mntmChangePassword = new JMenuItem("Change Password");
		mnUserAccount.add(mntmChangePassword);

		JMenuItem mntmLogOff = new JMenuItem("Log off");
		mnUserAccount.add(mntmLogOff);

		JMenuItem mntmExit_1 = new JMenuItem("Exit");
		mnUserAccount.add(mntmExit_1);

		JMenu mnHelp = new JMenu("Help");
		mnHelp.setIcon(new ImageIcon(Main.class
				.getResource("/image_Icon/Help.png")));
		menuBar.add(mnHelp);

		mntmAbout = new JMenuItem("About");

		mnHelp.add(mntmAbout);

		mntmHelpFile = new JMenuItem("Help File");

		mnHelp.add(mntmHelpFile);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(139, 69, 19));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JToolBar toolBar = new JToolBar();
		toolBar.setBackground(new Color(139, 69, 19));
		toolBar.setFloatable(false);

		desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(85, 107, 47));

		JLabel lblHospitalManagementSystem = new JLabel(
				"Hospital Management System Software");
		lblHospitalManagementSystem.setForeground(new Color(139, 0, 0));
		lblHospitalManagementSystem.setFont(new Font("Tahoma", Font.BOLD, 30));

		JLabel lblDesignDevelopment = new JLabel(
				"Design & Development By : Mohammad Iqbal Hossain");
		lblDesignDevelopment.setFont(new Font("Tahoma", Font.BOLD, 13));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane
				.createParallelGroup(Alignment.LEADING)
				.addGroup(
						gl_contentPane
								.createSequentialGroup()
								.addContainerGap()
								.addComponent(toolBar,
										GroupLayout.PREFERRED_SIZE, 193,
										GroupLayout.PREFERRED_SIZE)
								.addContainerGap(1068, Short.MAX_VALUE))
				.addGroup(
						gl_contentPane.createSequentialGroup()
								.addContainerGap(372, Short.MAX_VALUE)
								.addComponent(lblHospitalManagementSystem)
								.addGap(306))
				.addGroup(
						gl_contentPane
								.createSequentialGroup()
								.addGap(210)
								.addComponent(desktopPane,
										GroupLayout.PREFERRED_SIZE, 874,
										GroupLayout.PREFERRED_SIZE)
								.addContainerGap(189, Short.MAX_VALUE))
				.addGroup(
						gl_contentPane.createSequentialGroup().addGap(496)
								.addComponent(lblDesignDevelopment)
								.addContainerGap(434, Short.MAX_VALUE)));
		gl_contentPane
				.setVerticalGroup(gl_contentPane
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_contentPane
										.createSequentialGroup()
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addContainerGap()
																		.addComponent(
																				toolBar,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE))
														.addComponent(
																lblHospitalManagementSystem))
										.addPreferredGap(
												ComponentPlacement.RELATED,
												GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(desktopPane,
												GroupLayout.PREFERRED_SIZE,
												565, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addComponent(lblDesignDevelopment,
												GroupLayout.PREFERRED_SIZE, 17,
												GroupLayout.PREFERRED_SIZE)
										.addContainerGap()));
		GroupLayout gl_desktopPane = new GroupLayout(desktopPane);
		gl_desktopPane.setHorizontalGroup(gl_desktopPane.createParallelGroup(
				Alignment.LEADING).addGap(0, 648, Short.MAX_VALUE));
		gl_desktopPane.setVerticalGroup(gl_desktopPane.createParallelGroup(
				Alignment.LEADING).addGap(0, 369, Short.MAX_VALUE));
		desktopPane.setLayout(gl_desktopPane);

		btnNew = new JButton("New");
		btnNew.setBackground(new Color(85, 107, 47));

		btnNew.setIcon(new ImageIcon(
				Main.class
						.getResource("")));
		toolBar.add(btnNew);
		contentPane.setLayout(gl_contentPane);
	}

	private void createEvents() {
		btnNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (form1 == null || form1.isClosed()) {
					form1 = new Form1();
					desktopPane.add(form1);
					form1.show();
				}

			}
		});
		mntmStepInpatient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (step_1 == null || step_1.isClosed()) {
					step_1 = new Step_1();
					desktopPane.add(step_1);
					step_1.show();
				}
			}
		});
		mntmStepGuardeans.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (step_2 == null || step_2.isClosed()) {
					step_2 = new Step_2();
					desktopPane.add(step_2);
					step_2.show();
				}
			}
		});
		mntmStepRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (step_3 == null || step_3.isClosed()) {
					step_3 = new Step_3();
					desktopPane.add(step_3);
					step_3.show();
				}
			}
		});
		mntmAddMedicalTreatments.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (add_Medical_Treatments == null
						|| add_Medical_Treatments.isClosed()) {
					add_Medical_Treatments = new Add_Medical_Treatments();
					desktopPane.add(add_Medical_Treatments);
					add_Medical_Treatments.show();
				}
			}
		});
		mntmEditMedicalTreatments.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (edit_Medical_Treatments_Records == null
						|| edit_Medical_Treatments_Records.isClosed()) {
					edit_Medical_Treatments_Records = new Edit_Medical_Treatments_Records();
					desktopPane.add(edit_Medical_Treatments_Records);
					edit_Medical_Treatments_Records.show();
				}
			}
		});
		mntmViewOverallPatient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (view_Overall_Patient_Bill == null
						|| view_Overall_Patient_Bill.isClosed()) {
					view_Overall_Patient_Bill = new View_Overall_Patient_Bill();
					desktopPane.add(view_Overall_Patient_Bill);
					view_Overall_Patient_Bill.show();
				}
			}
		});
		mntmDischargePatient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (discharge_Patient == null || discharge_Patient.isClosed()) {
					discharge_Patient = new Discharge_Patient();
					desktopPane.add(discharge_Patient);
					discharge_Patient.show();
				}

			}
		});
		mntmOutpatientsMaintenance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (outpatients_Maintenance == null
						|| outpatients_Maintenance.isClosed()) {
					outpatients_Maintenance = new Outpatients_Maintenance();
					desktopPane.add(outpatients_Maintenance);
					outpatients_Maintenance.show();
				}

			}
		});
		mntmAddServictreatments.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (add_ServicTreatments == null
						|| add_ServicTreatments.isClosed()) {
					add_ServicTreatments = new Add_ServicTreatments();
					desktopPane.add(add_ServicTreatments);
					add_ServicTreatments.show();
				}
			}
		});
		mntmEditServicTreatments.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (edit_Servic_Treatments_Report == null
						|| edit_Servic_Treatments_Report.isClosed()) {
					edit_Servic_Treatments_Report = new Edit_Servic_Treatments_Report();
					desktopPane.add(edit_Servic_Treatments_Report);
					edit_Servic_Treatments_Report.show();
				}
			}
		});
		mntmAddMedicalTreatments_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (add_Medical_Treatments1 == null
						|| add_Medical_Treatments1.isClosed()) {
					add_Medical_Treatments1 = new Add_Medical_Treatments1();
					desktopPane.add(add_Medical_Treatments1);
					add_Medical_Treatments1.show();
				}
			}
		});
		mntmEditMedicalTreatments_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (edit_Medical_Treatments1 == null
						|| edit_Medical_Treatments1.isClosed()) {
					edit_Medical_Treatments1 = new Edit_Medical_Treatments1();
					desktopPane.add(edit_Medical_Treatments1);
					edit_Medical_Treatments1.show();
				}
			}
		});
		mntmViewOverallPatient_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (view_Overall_Patient_Bill1 == null
						|| view_Overall_Patient_Bill1.isClosed()) {
					view_Overall_Patient_Bill1 = new View_Overall_Patient_Bill1();
					desktopPane.add(view_Overall_Patient_Bill1);
					view_Overall_Patient_Bill1.show();
				}
			}
		});
		mntmManageAppointments.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (manage_Appointments == null
						|| manage_Appointments.isClosed()) {
					manage_Appointments = new Manage_Appointments();
					desktopPane.add(manage_Appointments);
					manage_Appointments.show();
				}
			}
		});
		mntmManagePatientBill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (manage_Patient_Bill == null
						|| manage_Patient_Bill.isClosed()) {
					manage_Patient_Bill = new Manage_Patient_Bill();
					desktopPane.add(manage_Patient_Bill);
					manage_Patient_Bill.show();
				}
			}
		});
		mntmSerchPayments.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (serch_Payments == null || serch_Payments.isClosed()) {
					serch_Payments = new Serch_Payments();
					desktopPane.add(serch_Payments);
					serch_Payments.show();
				}
			}
		});
		mntmSerchPayments_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (serch_Payments1 == null || serch_Payments1.isClosed()) {
					serch_Payments1 = new Serch_Payments1();
					desktopPane.add(serch_Payments1);
					serch_Payments1.show();
				}
			}
		});
		mntmManagePatientBill_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (manage_Patient_Bill1 == null
						|| manage_Patient_Bill1.isClosed()) {
					manage_Patient_Bill1 = new Manage_Patient_Bill1();
					desktopPane.add(manage_Patient_Bill1);
					manage_Patient_Bill1.show();
				}
			}
		});
		mntmInpatientsMasterReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (inpatients_Master_report == null
						|| inpatients_Master_report.isClosed()) {
					inpatients_Master_report = new Inpatients_Master_report();
					desktopPane.add(inpatients_Master_report);
					inpatients_Master_report.show();
				}
			}
		});
		mntmOutpatientsMasterReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (outpatients_Master_Report == null
						|| outpatients_Master_Report.isClosed()) {
					outpatients_Master_Report = new Outpatients_Master_Report();
					desktopPane.add(outpatients_Master_Report);
					outpatients_Master_Report.show();
				}
			}
		});
		mntmChannelingPatientsMaster.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (channeling_Patients_Master_Reports1 == null
						|| channeling_Patients_Master_Reports1.isClosed()) {
					channeling_Patients_Master_Reports1 = new Channeling_Patients_Master_Reports1();
					desktopPane.add(channeling_Patients_Master_Reports1);
					channeling_Patients_Master_Reports1.show();
				}
			}
		});
		mntmPatientAdmissionMaster.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (patient_Admission_Master_Report == null
						|| patient_Admission_Master_Report.isClosed()) {
					patient_Admission_Master_Report = new Patient_Admission_Master_Report();
					desktopPane.add(patient_Admission_Master_Report);
					patient_Admission_Master_Report.show();
				}
			}
		});
		mntmPatientDischargeMaster.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (patient_Discharge_Maste_Report == null
						|| patient_Discharge_Maste_Report.isClosed()) {
					patient_Discharge_Maste_Report = new Patient_Discharge_Maste_Report();
					desktopPane.add(patient_Discharge_Maste_Report);
					patient_Discharge_Maste_Report.show();
				}
			}
		});
		mntmDoctorsVisitsMaster.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (doctors_Visits_Master_report == null
						|| doctors_Visits_Master_report.isClosed()) {
					doctors_Visits_Master_report = new Doctors_Visits_Master_report();
					desktopPane.add(doctors_Visits_Master_report);
					doctors_Visits_Master_report.show();
				}
			}
		});
		mntmInpatients.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (inpatients == null || inpatients.isClosed()) {
					inpatients = new Inpatients();
					desktopPane.add(inpatients);
					inpatients.show();
				}
			}
		});
		mntmOutpatients_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (outpatients == null || outpatients.isClosed()) {
					outpatients = new Outpatients();
					desktopPane.add(outpatients);
					outpatients.show();
				}
			}
		});
		mntmInpatients_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (inpatients1 == null || inpatients1.isClosed()) {
					inpatients1 = new Inpatients1();
					desktopPane.add(inpatients1);
					inpatients1.show();
				}
			}
		});
		mntmOutpatients.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (outpatients1 == null || outpatients1.isClosed()) {
					outpatients1 = new Outpatients1();
					desktopPane.add(outpatients1);
					outpatients1.show();
				}
			}
		});

		mntmDoctorsMasterReports.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (doctors_Master_Reports == null
						|| doctors_Master_Reports.isClosed()) {
					doctors_Master_Reports = new Doctors_Master_Reports();
					desktopPane.add(doctors_Master_Reports);
					doctors_Master_Reports.show();
				}
			}
		});
		mntmDoctorsChanclingSchedul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (doctors_Chancling_Schedul_Report == null
						|| doctors_Chancling_Schedul_Report.isClosed()) {
					doctors_Chancling_Schedul_Report = new Doctors_Chancling_Schedul_Report();
					desktopPane.add(doctors_Chancling_Schedul_Report);
					doctors_Chancling_Schedul_Report.show();
				}
			}
		});
		mntmAllCompaniesMaster.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (all_Companies_Maste_Report == null
						|| all_Companies_Maste_Report.isClosed()) {
					all_Companies_Maste_Report = new All_Companies_Maste_Report();
					desktopPane.add(all_Companies_Maste_Report);
					all_Companies_Maste_Report.show();
				}
			}
		});
		mntmInpatient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (inpatients2 == null || inpatients2.isClosed()) {
					inpatients2 = new Inpatients2();
					desktopPane.add(inpatients2);
					inpatients2.show();
				}
			}
		});
		mntmOutpatients_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (outpatients2 == null || outpatients2.isClosed()) {
					outpatients2 = new Outpatients2();
					desktopPane.add(outpatients2);
					outpatients2.show();
				}
			}
		});
		mntmMedicineMasterReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (medicine_Master_Report == null
						|| medicine_Master_Report.isClosed()) {
					medicine_Master_Report = new Medicine_Master_Report();
					desktopPane.add(medicine_Master_Report);
					medicine_Master_Report.show();
				}
			}
		});
		mntmMedicalServicesMaster.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (medical_Services_Master_Report == null
						|| medical_Services_Master_Report.isClosed()) {
					medical_Services_Master_Report = new Medical_Services_Master_Report();
					desktopPane.add(medical_Services_Master_Report);
					medical_Services_Master_Report.show();
				}
			}
		});
		mntmDepartmentMasterReports.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (department_Master_Reports == null
						|| department_Master_Reports.isClosed()) {
					department_Master_Reports = new Department_Master_Reports();
					desktopPane.add(department_Master_Reports);
					department_Master_Reports.show();
				}
			}
		});
		mntmRoomsMasterReports.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rooms_Master_Reports == null
						|| rooms_Master_Reports.isClosed()) {
					rooms_Master_Reports = new Rooms_Master_Reports();
					desktopPane.add(rooms_Master_Reports);
					rooms_Master_Reports.show();
				}
			}
		});
		mntmInpatientsInvoice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (inpatients_Invoice == null || inpatients_Invoice.isClosed()) {
					inpatients_Invoice = new Inpatients_Invoice();
					desktopPane.add(inpatients_Invoice);
					inpatients_Invoice.show();
				}
			}
		});
		mntmInpatientRevenueReports.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (inpatient_Revenue_Reports == null
						|| inpatient_Revenue_Reports.isClosed()) {
					inpatient_Revenue_Reports = new Inpatient_Revenue_Reports();
					desktopPane.add(inpatient_Revenue_Reports);
					inpatient_Revenue_Reports.show();
				}
			}
		});
		mntmOutpatientsRevenueReports.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (outpatients_Revenue_Reports == null
						|| outpatients_Revenue_Reports.isClosed()) {
					outpatients_Revenue_Reports = new Outpatients_Revenue_Reports();
					desktopPane.add(outpatients_Revenue_Reports);
					outpatients_Revenue_Reports.show();
				}
			}
		});
		mntmDocterEarningReports.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (docter_Earning_Reports == null
						|| docter_Earning_Reports.isClosed()) {
					docter_Earning_Reports = new Docter_Earning_Reports();
					desktopPane.add(docter_Earning_Reports);
					docter_Earning_Reports.show();
				}
			}
		});
		mntmBillStatusReports.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (bill_Status_Reports == null
						|| bill_Status_Reports.isClosed()) {
					bill_Status_Reports = new Bill_Status_Reports();
					desktopPane.add(bill_Status_Reports);
					bill_Status_Reports.show();
				}
			}
		});
		mntmDoctorsMaintenance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (doctors_Maintenance == null
						|| doctors_Maintenance.isClosed()) {
					doctors_Maintenance = new Doctors_Maintenance();
					desktopPane.add(doctors_Maintenance);
					doctors_Maintenance.show();
				}
			}
		});
		mntmDoctersSchedulesMaintenance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (docters_Schedules_Maintenance == null
						|| docters_Schedules_Maintenance.isClosed()) {
					docters_Schedules_Maintenance = new Docters_Schedules_Maintenance();
					desktopPane.add(docters_Schedules_Maintenance);
					docters_Schedules_Maintenance.show();
				}
			}
		});
		mntmMedicinesMaintenance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (medicines_Maintenance == null
						|| medicines_Maintenance.isClosed()) {
					medicines_Maintenance = new Medicines_Maintenance();
					desktopPane.add(medicines_Maintenance);
					medicines_Maintenance.show();
				}
			}
		});
		mntmHospitalServicesMaintenance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (hospital_Services_Maintenance == null
						|| hospital_Services_Maintenance.isClosed()) {
					hospital_Services_Maintenance = new Hospital_Services_Maintenance();
					desktopPane.add(hospital_Services_Maintenance);
					hospital_Services_Maintenance.show();
				}
			}
		});
		mntmDepartmentsMaintenance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (departments_Maintenance == null
						|| departments_Maintenance.isClosed()) {
					departments_Maintenance = new Departments_Maintenance();
					desktopPane.add(departments_Maintenance);
					departments_Maintenance.show();
				}
			}
		});
		mntmWardsMaintenance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (wards_Maintenance == null || wards_Maintenance.isClosed()) {
					wards_Maintenance = new Wards_Maintenance();
					desktopPane.add(wards_Maintenance);
					wards_Maintenance.show();
				}

			}
		});
		mntmRoomsMaintenance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rooms_Maintenance == null || rooms_Maintenance.isClosed()) {
					rooms_Maintenance = new Rooms_Maintenance();
					desktopPane.add(rooms_Maintenance);
					rooms_Maintenance.show();
				}
			}
		});
		mntmCorporateMaintenance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (corporate_Maintenance == null
						|| corporate_Maintenance.isClosed()) {
					corporate_Maintenance = new Corporate_Maintenance();
					desktopPane.add(corporate_Maintenance);
					corporate_Maintenance.show();
				}
			}
		});
		mntmManageUserAccounts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (manage_User_Accounts == null
						|| manage_User_Accounts.isClosed()) {
					manage_User_Accounts = new Manage_User_Accounts();
					desktopPane.add(manage_User_Accounts);
					manage_User_Accounts.show();
				}
			}
		});
		mntmChangePassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (change_Password == null || change_Password.isClosed()) {
					change_Password = new Change_Password();
					desktopPane.add(change_Password);
					change_Password.show();
				}
			}
		});
		mntmAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (about == null || about.isClosed()) {
					about = new About();
					desktopPane.add(about);
					about.show();
				}
			}
		});
		mntmHelpFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (help_File == null || help_File.isClosed()) {
					help_File = new Help_File();
					desktopPane.add(help_File);
					help_File.show();
				}
			}
		});

	}
}
