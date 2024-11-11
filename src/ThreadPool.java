public class ThreadPool {
    private int N;

    public ThreadPool(int n) {
        N = n;
    }

        {
            System.out.println("calling acquire")

            ThreadPool.acquire(this)

            System.out.println("after  acquire DOING WORK")

            sleep(500)

            System.out.println("FINISHED WORK - RELEASING")

            ThreadPool.release()
            System.out.println("AFTER RELEASE")
        }

        acquire()
        {
            if( num_of_active threads < max)
            {
                Active thread++;
                return;
            }
            Else
            {
                sync(THreadsArray)
                putThread in waiting threads array
                Make thread to wait

            }

        }


        הפעולה Release
        Release()
        {
            Num of active threads–
            if( threads in Thread array)
            Notify Thread from Thread array
            Num of active threads++




        }








    }
