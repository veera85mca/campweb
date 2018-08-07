Feature: Test the patient list validation in web end

@patientlist
Scenario Outline: Test the patient information and case sheet and glass prescription

Given Select the browser as <Browser>
When Give the camp management url as <Url>
And Enter the camp user name as <Username>
But Enter the camp user passdword as <Password>
Then click to login button
When click to patientlist tab and search filter link for search the patient in worklist
And Give the uid and patientname respective as <UID>, <Patientname> in search filter
Then click to search button
But validate Uid, patientname, age as <Age>, sex as <Sex> and mobileno as <Mobileno> in worklist
When Click to patientid link
And Validate the uid, patientname, age, sex and mobileno in patient info
But Validate the address, state, district and taluk as <Address>, <State>, <District>, <Taluk> in patient info
Then Validate the aadhaarno, occupation, caste and income as <Aadhaarno>, <Occupation>, <Caste>, <Income> in patient info
When Validate the Token id as <Token> in patient info
And Click to casesheet tab for validation
When Have you had a medical check up in the past one year as <General1> in general questions
But Do you have Diabetes as <General2> in general questions
And Do you have Hypertension as <General3> in general questions
Then Do you Smoke as <General4> in general questions
When Do you consume Alcohol as <General5> in general questions
And Have you ever had eye examination as <General6> in general questions
Given Do you have any difficulty in seeing distant object as <General7> in general questions
When Have you been advised to wear glassess ever as <General8> in general questions
But Are you using any glasses currently as <General9> in general questions
Then Are you aware of nearby hospital as <General10> and Type of hospital as <General11> in general questions
And Validate the Blood pressure max level as <Bpmax> over min level as <BPmin> in Medical Examination
But Validate the Blood sugar as <Bloodsugar> in Medical Examination
Then Validate the Syringing as <Syring> in Medical Examination
When Validate the Weight and Height as <Weight>, <Height> in Medical Examination
Given Validate the Right and Left eye Intraocular pressure as <RighteyeIntracular>, <LefteyeIntracular>
But validate the VA Right eye Un-Aided Distance as <RUAD>
When validate the VA Right eye Un-Aided Near as <RUAN>
But validate the VA Left eye Un-Aided Distance as <LUAD>
And validate the VA Left eye Un-Aided Near as <LUAN>
Then validate the VA Right eye Aided Dist as <RAD>
But validate the VA Right eye Aided Near as <RAN>
When validate the VA Left eye Aided Dist as <LAD>
And validate the VA Left eye Aided Near as <LAN>
But validate the VA Right eye Pinhole as <Rpinhole>
Then validate the VA Left eye Pinhole as <Lpinhole>
And validate the VA Right eye color as <Rcolor>
Given validate the VA Left eye color as <Lcolor>
And Validate the Treatment for refraction as <Refraction> in casesheet
When Validate the Do you want to refer as <Refer>, and Refer for as <Referfor> then Referred to <Referto>



Examples:
|Browser|Url|Username|Password|UID|Patientname|Age|Sex|Mobileno|Address|State|District|Taluk|Aadhaarno|Occupation|Caste|Income|Token|General1|General2|General3|General4|General5|General6|General7|General8|General9|General10|General11|Bpmax|BPmin|Bloodsugar|Syring|Weight|Height|RighteyeIntracular|LefteyeIntracular|RUAD|RUAN|LUAD|LUAN|RAD|RAN|LAD|LAN|Rpinhole|Lpinhole|Rcolor|Lcolor|Refraction|Refer|Referfor|Referto|
|Firefox|http://192.168.0.199/CampManagement|fst@hos.in|password|CAM001|VEERA|51|Male|78454888945|RAVHSJ|Tamil Nadu|Ramanathapuram|RAM|879456494589|Private|SC/ST|>10000|E - Only Color vision problem|Yes|Yes|Yes|Yes|Yes|Yes|Yes|Yes|Yes|Yes|Govt|25|35|123|Yes|45|89|23|35|6/9|N8|6/9|N8|6/9|N8|6/9|N8|6/9|6/9|-|-|Distance|No|||