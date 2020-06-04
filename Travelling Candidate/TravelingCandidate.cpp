#include<iostream>
#include<math.h>
#include<algorithm>
#include <string.h>
using namespace std;

class candidate
{
public:
    
    int i_id;
    int i_aDist;
    int i_bDist;
    
    string s_travellingTo;

public:

    void TravelToA()
    {
       s_travellingTo = " travellingTo A";
    }
    
    void TravelToB()
    {
       s_travellingTo = " travellingTo B";
    }
    
    void printCandidate(bool skipA=false,bool skipB=false)
    {
        cout << "id = " << i_id;
        if(!skipA)
            cout << ", A_Distance = " << i_aDist ;
        if(!skipB)
            cout << ", B_Distance = " << i_bDist ;
        if(s_travellingTo!="")
            cout << ", " << s_travellingTo ;
        cout << endl;
    }
};

int fnGetMinimumCost(candidate* clpacandidates, int iaNoOfCandidates)
{
    if(iaNoOfCandidates<2)
        return -1;
    
    if(clpacandidates == nullptr)
        return -1;
    
	if(iaNoOfCandidates %2 != 0)
        return -1;
	
    candidate travelingCandidate[iaNoOfCandidates];

    memcpy(travelingCandidate, clpacandidates, iaNoOfCandidates* sizeof(candidate));


    sort(travelingCandidate, travelingCandidate+iaNoOfCandidates, [](const candidate& i1, const candidate& i2)
                                                                    {
                                                                        return ((i1.i_aDist - i1.i_bDist) < (i2.i_aDist-i2.i_bDist));
                                                                    }); 

    int iCost=0;
    for (int i=0; i<iaNoOfCandidates/2;i++)
    {
       int index = travelingCandidate[i].i_id-1;    
       clpacandidates[index].TravelToA();
       iCost += clpacandidates[index].i_aDist;
    }

    for (int i=iaNoOfCandidates/2; i<iaNoOfCandidates;i++)
    {
       int index = travelingCandidate[i].i_id-1;    
       clpacandidates[index].TravelToB();
       iCost += clpacandidates[index].i_bDist;
    }
    
    return iCost; 
}

int main()
{
    const int iNoOfCandidates = 6;
    
    candidate cldata[iNoOfCandidates];
    
    cldata[0]={1,2,8};
    cldata[1]={2,1,3};
    cldata[2]={3,6,2};
    cldata[3]={4,1,7};
    cldata[4]={5,3,8};
    cldata[5]={6,4,7};

    cout << "Total Cost is = " << fnGetMinimumCost(cldata, iNoOfCandidates);
    
    cout << endl << "Traveling "<<endl;
    for (int i=0; i<iNoOfCandidates;i++)
        cldata[i].printCandidate(true,true);
        
    return 0;
}