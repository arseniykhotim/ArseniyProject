package Less1.Lesson7.home_work2;

public class Patient
{
   private int plan;
    private Doctor doctor;
    public Patient() {
    }

    public Patient(int plan) {
        this.plan = plan;
    }

    public int getPlan() {
        return plan;
    }

    public void setPlan() {
        this.plan = plan;
    }

    void chooseDoctorForPatient() {
        if (plan == 1)
        {
            System.out.println("Назначить Хирурга");
            Surgeon surgeon = new Surgeon();
            doctor = surgeon;
            surgeon.treat();


        }
        else if (plan == 2) {
            System.out.println("Назначить Дантиста");
            Dentist dentist = new Dentist();
            doctor = dentist;
            dentist.treat();
        }
        else if (plan == 3) {
            System.out.println("Назначить Терапевта");
            Therapist therapist = new Therapist();
            doctor = therapist;
            therapist.treat();
        }
    }
}
