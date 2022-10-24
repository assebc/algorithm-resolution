class FizzBuzz {
private:
    int n;
    int cur;
    mutex lock;

public:
    FizzBuzz(int n) {
        this->n = n;
        this->cur = 1;
    }

    void fizz(function<void()> printFizz) {
        while(this->cur <= this->n){
            if(this->cur % 15 != 0 && this->cur % 3 == 0){
                lock.lock();
                printFizz();
                this->cur++;
                lock.unlock();
            }
        }
    }

    void buzz(function<void()> printBuzz) {
        while(this->cur <= this->n){
            if(this->cur % 15 != 0 && this->cur % 5 == 0){
                lock.lock();
                printBuzz();
                this->cur++;
                lock.unlock();
            }
        }
    }

	void fizzbuzz(function<void()> printFizzBuzz) {
        while(this->cur <= this->n){
            if(this->cur % 15 == 0){
                lock.lock();
                printFizzBuzz();
                this->cur++;
                lock.unlock();
            }
        }
    }

    void number(function<void(int)> printNumber) {
        while(this->cur <= this->n){
            if(this->cur % 3 != 0 && this->cur % 5 != 0){
                lock.lock();
                printNumber(this->cur);
                this->cur++;
                lock.unlock();
            }
        }
    }
};