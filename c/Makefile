CC=gcc
CPP=g++
DEBUG=-g
#CFLAGS=-c
CFLAGS=-c -D OMITGOOD -D OMITBAD
LFLAGS=-lpthread

INCLUDES=-I testcasesupport

SUPPORT_PATH=testcasesupport/

MAIN=$(SUPPORT_PATH)main_linux.cpp
MAIN_OBJECT=main_linux.o

C_SUPPORT_FILES=$(SUPPORT_PATH)io.c $(SUPPORT_PATH)std_thread.c
C_SUPPORT_OBJECTS=io.o std_thread.o

# only grab the .c files without "w32" or "wchar_t" in the name
C_SOURCES=$(filter-out $(wildcard CWE114_Process_Control/*/CWE*w32*.c) $(wildcard CWE114_Process_Control/*/CWE*wchar_t*.c),$(wildcard CWE114_Process_Control/*/CWE*.c)) \
$(filter-out $(wildcard CWE121_Stack_Based_Buffer_Overflow/*/CWE*w32*.c) $(wildcard CWE121_Stack_Based_Buffer_Overflow/*/CWE*wchar_t*.c),$(wildcard CWE121_Stack_Based_Buffer_Overflow/*/CWE*.c)) \
$(filter-out $(wildcard CWE122_Heap_Based_Buffer_Overflow/*/CWE*w32*.c) $(wildcard CWE122_Heap_Based_Buffer_Overflow/*/CWE*wchar_t*.c),$(wildcard CWE122_Heap_Based_Buffer_Overflow/*/CWE*.c)) \
$(filter-out $(wildcard CWE123_Write_What_Where_Condition/*/CWE*w32*.c) $(wildcard CWE123_Write_What_Where_Condition/*/CWE*wchar_t*.c),$(wildcard CWE123_Write_What_Where_Condition/*/CWE*.c)) \
$(filter-out $(wildcard CWE124_Buffer_Underwrite/*/CWE*w32*.c) $(wildcard CWE124_Buffer_Underwrite/*/CWE*wchar_t*.c),$(wildcard CWE124_Buffer_Underwrite/*/CWE*.c)) \
$(filter-out $(wildcard CWE126_Buffer_Overread/*/CWE*w32*.c) $(wildcard CWE126_Buffer_Overread/*/CWE*wchar_t*.c),$(wildcard CWE126_Buffer_Overread/*/CWE*.c)) \
$(filter-out $(wildcard CWE127_Buffer_Underread/*/CWE*w32*.c) $(wildcard CWE127_Buffer_Underread/*/CWE*wchar_t*.c),$(wildcard CWE127_Buffer_Underread/*/CWE*.c)) \
$(filter-out $(wildcard CWE134_Uncontrolled_Format_String/*/CWE*w32*.c) $(wildcard CWE134_Uncontrolled_Format_String/*/CWE*wchar_t*.c),$(wildcard CWE134_Uncontrolled_Format_String/*/CWE*.c)) \
$(filter-out $(wildcard CWE15_External_Control_of_System_or_Configuration_Setting/*/CWE*w32*.c) $(wildcard CWE15_External_Control_of_System_or_Configuration_Setting/*/CWE*wchar_t*.c),$(wildcard CWE15_External_Control_of_System_or_Configuration_Setting/*/CWE*.c)) \
$(filter-out $(wildcard CWE188_Reliance_on_Data_Memory_Layout/*/CWE*w32*.c) $(wildcard CWE188_Reliance_on_Data_Memory_Layout/*/CWE*wchar_t*.c),$(wildcard CWE188_Reliance_on_Data_Memory_Layout/*/CWE*.c)) \
$(filter-out $(wildcard CWE190_Integer_Overflow/*/CWE*w32*.c) $(wildcard CWE190_Integer_Overflow/*/CWE*wchar_t*.c),$(wildcard CWE190_Integer_Overflow/*/CWE*.c)) \
$(filter-out $(wildcard CWE191_Integer_Underflow/*/CWE*w32*.c) $(wildcard CWE191_Integer_Underflow/*/CWE*wchar_t*.c),$(wildcard CWE191_Integer_Underflow/*/CWE*.c)) \
$(filter-out $(wildcard CWE194_Unexpected_Sign_Extension/*/CWE*w32*.c) $(wildcard CWE194_Unexpected_Sign_Extension/*/CWE*wchar_t*.c),$(wildcard CWE194_Unexpected_Sign_Extension/*/CWE*.c)) \
$(filter-out $(wildcard CWE195_Signed_to_Unsigned_Conversion_Error/*/CWE*w32*.c) $(wildcard CWE195_Signed_to_Unsigned_Conversion_Error/*/CWE*wchar_t*.c),$(wildcard CWE195_Signed_to_Unsigned_Conversion_Error/*/CWE*.c)) \
$(filter-out $(wildcard CWE196_Unsigned_to_Signed_Conversion_Error/*/CWE*w32*.c) $(wildcard CWE196_Unsigned_to_Signed_Conversion_Error/*/CWE*wchar_t*.c),$(wildcard CWE196_Unsigned_to_Signed_Conversion_Error/*/CWE*.c)) \
$(filter-out $(wildcard CWE197_Numeric_Truncation_Error/*/CWE*w32*.c) $(wildcard CWE197_Numeric_Truncation_Error/*/CWE*wchar_t*.c),$(wildcard CWE197_Numeric_Truncation_Error/*/CWE*.c)) \
$(filter-out $(wildcard CWE204_Response_Discrepancy_Information_Exposure/*/CWE*w32*.c) $(wildcard CWE204_Response_Discrepancy_Information_Exposure/*/CWE*wchar_t*.c),$(wildcard CWE204_Response_Discrepancy_Information_Exposure/*/CWE*.c)) \
$(filter-out $(wildcard CWE222_Truncation_of_Security_Relevant_Information/*/CWE*w32*.c) $(wildcard CWE222_Truncation_of_Security_Relevant_Information/*/CWE*wchar_t*.c),$(wildcard CWE222_Truncation_of_Security_Relevant_Information/*/CWE*.c)) \
$(filter-out $(wildcard CWE223_Omission_of_Security_Relevant_Information/*/CWE*w32*.c) $(wildcard CWE223_Omission_of_Security_Relevant_Information/*/CWE*wchar_t*.c),$(wildcard CWE223_Omission_of_Security_Relevant_Information/*/CWE*.c)) \
$(filter-out $(wildcard CWE226_Sensitive_Information_Uncleared_Before_Release/*/CWE*w32*.c) $(wildcard CWE226_Sensitive_Information_Uncleared_Before_Release/*/CWE*wchar_t*.c),$(wildcard CWE226_Sensitive_Information_Uncleared_Before_Release/*/CWE*.c)) \
$(filter-out $(wildcard CWE23_Relative_Path_Traversal/*/CWE*w32*.c) $(wildcard CWE23_Relative_Path_Traversal/*/CWE*wchar_t*.c),$(wildcard CWE23_Relative_Path_Traversal/*/CWE*.c)) \
$(filter-out $(wildcard CWE242_Use_of_Inherently_Dangerous_Function/*/CWE*w32*.c) $(wildcard CWE242_Use_of_Inherently_Dangerous_Function/*/CWE*wchar_t*.c),$(wildcard CWE242_Use_of_Inherently_Dangerous_Function/*/CWE*.c)) \
$(filter-out $(wildcard CWE244_Heap_Inspection/*/CWE*w32*.c) $(wildcard CWE244_Heap_Inspection/*/CWE*wchar_t*.c),$(wildcard CWE244_Heap_Inspection/*/CWE*.c)) \
$(filter-out $(wildcard CWE247_Reliance_on_DNS_Lookups_in_Security_Decision/*/CWE*w32*.c) $(wildcard CWE247_Reliance_on_DNS_Lookups_in_Security_Decision/*/CWE*wchar_t*.c),$(wildcard CWE247_Reliance_on_DNS_Lookups_in_Security_Decision/*/CWE*.c)) \
$(filter-out $(wildcard CWE252_Unchecked_Return_Value/*/CWE*w32*.c) $(wildcard CWE252_Unchecked_Return_Value/*/CWE*wchar_t*.c),$(wildcard CWE252_Unchecked_Return_Value/*/CWE*.c)) \
$(filter-out $(wildcard CWE253_Incorrect_Check_of_Function_Return_Value/*/CWE*w32*.c) $(wildcard CWE253_Incorrect_Check_of_Function_Return_Value/*/CWE*wchar_t*.c),$(wildcard CWE253_Incorrect_Check_of_Function_Return_Value/*/CWE*.c)) \
$(filter-out $(wildcard CWE256_Plaintext_Storage_of_Password/*/CWE*w32*.c) $(wildcard CWE256_Plaintext_Storage_of_Password/*/CWE*wchar_t*.c),$(wildcard CWE256_Plaintext_Storage_of_Password/*/CWE*.c)) \
$(filter-out $(wildcard CWE259_Hard_Coded_Password/*/CWE*w32*.c) $(wildcard CWE259_Hard_Coded_Password/*/CWE*wchar_t*.c),$(wildcard CWE259_Hard_Coded_Password/*/CWE*.c)) \
$(filter-out $(wildcard CWE272_Least_Privilege_Violation/*/CWE*w32*.c) $(wildcard CWE272_Least_Privilege_Violation/*/CWE*wchar_t*.c),$(wildcard CWE272_Least_Privilege_Violation/*/CWE*.c)) \
$(filter-out $(wildcard CWE273_Improper_Check_for_Dropped_Privileges/*/CWE*w32*.c) $(wildcard CWE273_Improper_Check_for_Dropped_Privileges/*/CWE*wchar_t*.c),$(wildcard CWE273_Improper_Check_for_Dropped_Privileges/*/CWE*.c)) \
$(filter-out $(wildcard CWE284_Improper_Access_Control/*/CWE*w32*.c) $(wildcard CWE284_Improper_Access_Control/*/CWE*wchar_t*.c),$(wildcard CWE284_Improper_Access_Control/*/CWE*.c)) \
$(filter-out $(wildcard CWE304_Missing_Authentication_Step/*/CWE*w32*.c) $(wildcard CWE304_Missing_Authentication_Step/*/CWE*wchar_t*.c),$(wildcard CWE304_Missing_Authentication_Step/*/CWE*.c)) \
$(filter-out $(wildcard CWE319_Cleartext_Tx_Sensitive_Info/*/CWE*w32*.c) $(wildcard CWE319_Cleartext_Tx_Sensitive_Info/*/CWE*wchar_t*.c),$(wildcard CWE319_Cleartext_Tx_Sensitive_Info/*/CWE*.c)) \
$(filter-out $(wildcard CWE321_Hard_Coded_Cryptographic_Key/*/CWE*w32*.c) $(wildcard CWE321_Hard_Coded_Cryptographic_Key/*/CWE*wchar_t*.c),$(wildcard CWE321_Hard_Coded_Cryptographic_Key/*/CWE*.c)) \
$(filter-out $(wildcard CWE325_Missing_Required_Cryptographic_Step/*/CWE*w32*.c) $(wildcard CWE325_Missing_Required_Cryptographic_Step/*/CWE*wchar_t*.c),$(wildcard CWE325_Missing_Required_Cryptographic_Step/*/CWE*.c)) \
$(filter-out $(wildcard CWE327_Use_Broken_Crypto/*/CWE*w32*.c) $(wildcard CWE327_Use_Broken_Crypto/*/CWE*wchar_t*.c),$(wildcard CWE327_Use_Broken_Crypto/*/CWE*.c)) \
$(filter-out $(wildcard CWE328_Reversible_One_Way_Hash/*/CWE*w32*.c) $(wildcard CWE328_Reversible_One_Way_Hash/*/CWE*wchar_t*.c),$(wildcard CWE328_Reversible_One_Way_Hash/*/CWE*.c)) \
$(filter-out $(wildcard CWE338_Weak_PRNG/*/CWE*w32*.c) $(wildcard CWE338_Weak_PRNG/*/CWE*wchar_t*.c),$(wildcard CWE338_Weak_PRNG/*/CWE*.c)) \
$(filter-out $(wildcard CWE364_Signal_Handler_Race_Condition/*/CWE*w32*.c) $(wildcard CWE364_Signal_Handler_Race_Condition/*/CWE*wchar_t*.c),$(wildcard CWE364_Signal_Handler_Race_Condition/*/CWE*.c)) \
$(filter-out $(wildcard CWE366_Race_Condition_Within_Thread/*/CWE*w32*.c) $(wildcard CWE366_Race_Condition_Within_Thread/*/CWE*wchar_t*.c),$(wildcard CWE366_Race_Condition_Within_Thread/*/CWE*.c)) \
$(filter-out $(wildcard CWE367_TOC_TOU/*/CWE*w32*.c) $(wildcard CWE367_TOC_TOU/*/CWE*wchar_t*.c),$(wildcard CWE367_TOC_TOU/*/CWE*.c)) \
$(filter-out $(wildcard CWE369_Divide_by_Zero/*/CWE*w32*.c) $(wildcard CWE369_Divide_by_Zero/*/CWE*wchar_t*.c),$(wildcard CWE369_Divide_by_Zero/*/CWE*.c)) \
$(filter-out $(wildcard CWE36_Absolute_Path_Traversal/*/CWE*w32*.c) $(wildcard CWE36_Absolute_Path_Traversal/*/CWE*wchar_t*.c),$(wildcard CWE36_Absolute_Path_Traversal/*/CWE*.c)) \
$(filter-out $(wildcard CWE374_Passing_Mutable_Objects_to_Untrusted_Method/*/CWE*w32*.c) $(wildcard CWE374_Passing_Mutable_Objects_to_Untrusted_Method/*/CWE*wchar_t*.c),$(wildcard CWE374_Passing_Mutable_Objects_to_Untrusted_Method/*/CWE*.c)) \
$(filter-out $(wildcard CWE377_Insecure_Temporary_File/*/CWE*w32*.c) $(wildcard CWE377_Insecure_Temporary_File/*/CWE*wchar_t*.c),$(wildcard CWE377_Insecure_Temporary_File/*/CWE*.c)) \
$(filter-out $(wildcard CWE390_Error_Without_Action/*/CWE*w32*.c) $(wildcard CWE390_Error_Without_Action/*/CWE*wchar_t*.c),$(wildcard CWE390_Error_Without_Action/*/CWE*.c)) \
$(filter-out $(wildcard CWE391_Unchecked_Error_Condition/*/CWE*w32*.c) $(wildcard CWE391_Unchecked_Error_Condition/*/CWE*wchar_t*.c),$(wildcard CWE391_Unchecked_Error_Condition/*/CWE*.c)) \
$(filter-out $(wildcard CWE392_Missing_Report_of_Error_Condition/*/CWE*w32*.c) $(wildcard CWE392_Missing_Report_of_Error_Condition/*/CWE*wchar_t*.c),$(wildcard CWE392_Missing_Report_of_Error_Condition/*/CWE*.c)) \
$(filter-out $(wildcard CWE396_Catch_Generic_Exception/*/CWE*w32*.c) $(wildcard CWE396_Catch_Generic_Exception/*/CWE*wchar_t*.c),$(wildcard CWE396_Catch_Generic_Exception/*/CWE*.c)) \
$(filter-out $(wildcard CWE397_Throw_Generic_Exception/*/CWE*w32*.c) $(wildcard CWE397_Throw_Generic_Exception/*/CWE*wchar_t*.c),$(wildcard CWE397_Throw_Generic_Exception/*/CWE*.c)) \
$(filter-out $(wildcard CWE398_Poor_Code_Quality/*/CWE*w32*.c) $(wildcard CWE398_Poor_Code_Quality/*/CWE*wchar_t*.c),$(wildcard CWE398_Poor_Code_Quality/*/CWE*.c)) \
$(filter-out $(wildcard CWE400_Resource_Exhaustion/*/CWE*w32*.c) $(wildcard CWE400_Resource_Exhaustion/*/CWE*wchar_t*.c),$(wildcard CWE400_Resource_Exhaustion/*/CWE*.c)) \
$(filter-out $(wildcard CWE401_Memory_Leak/*/CWE*w32*.c) $(wildcard CWE401_Memory_Leak/*/CWE*wchar_t*.c),$(wildcard CWE401_Memory_Leak/*/CWE*.c)) \
$(filter-out $(wildcard CWE404_Improper_Resource_Shutdown/*/CWE*w32*.c) $(wildcard CWE404_Improper_Resource_Shutdown/*/CWE*wchar_t*.c),$(wildcard CWE404_Improper_Resource_Shutdown/*/CWE*.c)) \
$(filter-out $(wildcard CWE415_Double_Free/*/CWE*w32*.c) $(wildcard CWE415_Double_Free/*/CWE*wchar_t*.c),$(wildcard CWE415_Double_Free/*/CWE*.c)) \
$(filter-out $(wildcard CWE416_Use_After_Free/*/CWE*w32*.c) $(wildcard CWE416_Use_After_Free/*/CWE*wchar_t*.c),$(wildcard CWE416_Use_After_Free/*/CWE*.c)) \
$(filter-out $(wildcard CWE426_Untrusted_Search_Path/*/CWE*w32*.c) $(wildcard CWE426_Untrusted_Search_Path/*/CWE*wchar_t*.c),$(wildcard CWE426_Untrusted_Search_Path/*/CWE*.c)) \
$(filter-out $(wildcard CWE427_Uncontrolled_Search_Path_Element/*/CWE*w32*.c) $(wildcard CWE427_Uncontrolled_Search_Path_Element/*/CWE*wchar_t*.c),$(wildcard CWE427_Uncontrolled_Search_Path_Element/*/CWE*.c)) \
$(filter-out $(wildcard CWE440_Expected_Behavior_Violation/*/CWE*w32*.c) $(wildcard CWE440_Expected_Behavior_Violation/*/CWE*wchar_t*.c),$(wildcard CWE440_Expected_Behavior_Violation/*/CWE*.c)) \
$(filter-out $(wildcard CWE457_Use_of_Uninitialized_Variable/*/CWE*w32*.c) $(wildcard CWE457_Use_of_Uninitialized_Variable/*/CWE*wchar_t*.c),$(wildcard CWE457_Use_of_Uninitialized_Variable/*/CWE*.c)) \
$(filter-out $(wildcard CWE459_Incomplete_Cleanup/*/CWE*w32*.c) $(wildcard CWE459_Incomplete_Cleanup/*/CWE*wchar_t*.c),$(wildcard CWE459_Incomplete_Cleanup/*/CWE*.c)) \
$(filter-out $(wildcard CWE464_Addition_of_Data_Structure_Sentinel/*/CWE*w32*.c) $(wildcard CWE464_Addition_of_Data_Structure_Sentinel/*/CWE*wchar_t*.c),$(wildcard CWE464_Addition_of_Data_Structure_Sentinel/*/CWE*.c)) \
$(filter-out $(wildcard CWE467_Use_of_sizeof_on_Pointer_Type/*/CWE*w32*.c) $(wildcard CWE467_Use_of_sizeof_on_Pointer_Type/*/CWE*wchar_t*.c),$(wildcard CWE467_Use_of_sizeof_on_Pointer_Type/*/CWE*.c)) \
$(filter-out $(wildcard CWE468_Incorrect_Pointer_Scaling/*/CWE*w32*.c) $(wildcard CWE468_Incorrect_Pointer_Scaling/*/CWE*wchar_t*.c),$(wildcard CWE468_Incorrect_Pointer_Scaling/*/CWE*.c)) \
$(filter-out $(wildcard CWE469_Use_of_Pointer_Subtraction_to_Determine_Size/*/CWE*w32*.c) $(wildcard CWE469_Use_of_Pointer_Subtraction_to_Determine_Size/*/CWE*wchar_t*.c),$(wildcard CWE469_Use_of_Pointer_Subtraction_to_Determine_Size/*/CWE*.c)) \
$(filter-out $(wildcard CWE475_Undefined_Behavior_for_Input_to_API/*/CWE*w32*.c) $(wildcard CWE475_Undefined_Behavior_for_Input_to_API/*/CWE*wchar_t*.c),$(wildcard CWE475_Undefined_Behavior_for_Input_to_API/*/CWE*.c)) \
$(filter-out $(wildcard CWE476_NULL_Pointer_Dereference/*/CWE*w32*.c) $(wildcard CWE476_NULL_Pointer_Dereference/*/CWE*wchar_t*.c),$(wildcard CWE476_NULL_Pointer_Dereference/*/CWE*.c)) \
$(filter-out $(wildcard CWE478_Missing_Default_Case_in_Switch/*/CWE*w32*.c) $(wildcard CWE478_Missing_Default_Case_in_Switch/*/CWE*wchar_t*.c),$(wildcard CWE478_Missing_Default_Case_in_Switch/*/CWE*.c)) \
$(filter-out $(wildcard CWE479_Signal_Handler_Use_of_Non_Reentrant_Function/*/CWE*w32*.c) $(wildcard CWE479_Signal_Handler_Use_of_Non_Reentrant_Function/*/CWE*wchar_t*.c),$(wildcard CWE479_Signal_Handler_Use_of_Non_Reentrant_Function/*/CWE*.c)) \
$(filter-out $(wildcard CWE480_Use_of_Incorrect_Operator/*/CWE*w32*.c) $(wildcard CWE480_Use_of_Incorrect_Operator/*/CWE*wchar_t*.c),$(wildcard CWE480_Use_of_Incorrect_Operator/*/CWE*.c)) \
$(filter-out $(wildcard CWE481_Assigning_Instead_of_Comparing/*/CWE*w32*.c) $(wildcard CWE481_Assigning_Instead_of_Comparing/*/CWE*wchar_t*.c),$(wildcard CWE481_Assigning_Instead_of_Comparing/*/CWE*.c)) \
$(filter-out $(wildcard CWE482_Comparing_Instead_of_Assigning/*/CWE*w32*.c) $(wildcard CWE482_Comparing_Instead_of_Assigning/*/CWE*wchar_t*.c),$(wildcard CWE482_Comparing_Instead_of_Assigning/*/CWE*.c)) \
$(filter-out $(wildcard CWE483_Incorrect_Block_Delimitation/*/CWE*w32*.c) $(wildcard CWE483_Incorrect_Block_Delimitation/*/CWE*wchar_t*.c),$(wildcard CWE483_Incorrect_Block_Delimitation/*/CWE*.c)) \
$(filter-out $(wildcard CWE484_Omitted_Break_Statement_in_Switch/*/CWE*w32*.c) $(wildcard CWE484_Omitted_Break_Statement_in_Switch/*/CWE*wchar_t*.c),$(wildcard CWE484_Omitted_Break_Statement_in_Switch/*/CWE*.c)) \
$(filter-out $(wildcard CWE489_Leftover_Debug_Code/*/CWE*w32*.c) $(wildcard CWE489_Leftover_Debug_Code/*/CWE*wchar_t*.c),$(wildcard CWE489_Leftover_Debug_Code/*/CWE*.c)) \
$(filter-out $(wildcard CWE500_Public_Static_Field_Not_Final/*/CWE*w32*.c) $(wildcard CWE500_Public_Static_Field_Not_Final/*/CWE*wchar_t*.c),$(wildcard CWE500_Public_Static_Field_Not_Final/*/CWE*.c)) \
$(filter-out $(wildcard CWE506_Embedded_Malicious_Code/*/CWE*w32*.c) $(wildcard CWE506_Embedded_Malicious_Code/*/CWE*wchar_t*.c),$(wildcard CWE506_Embedded_Malicious_Code/*/CWE*.c)) \
$(filter-out $(wildcard CWE510_Trapdoor/*/CWE*w32*.c) $(wildcard CWE510_Trapdoor/*/CWE*wchar_t*.c),$(wildcard CWE510_Trapdoor/*/CWE*.c)) \
$(filter-out $(wildcard CWE511_Logic_Time_Bomb/*/CWE*w32*.c) $(wildcard CWE511_Logic_Time_Bomb/*/CWE*wchar_t*.c),$(wildcard CWE511_Logic_Time_Bomb/*/CWE*.c)) \
$(filter-out $(wildcard CWE534_Info_Exposure_Debug_Log/*/CWE*w32*.c) $(wildcard CWE534_Info_Exposure_Debug_Log/*/CWE*wchar_t*.c),$(wildcard CWE534_Info_Exposure_Debug_Log/*/CWE*.c)) \
$(filter-out $(wildcard CWE535_Info_Exposure_Shell_Error/*/CWE*w32*.c) $(wildcard CWE535_Info_Exposure_Shell_Error/*/CWE*wchar_t*.c),$(wildcard CWE535_Info_Exposure_Shell_Error/*/CWE*.c)) \
$(filter-out $(wildcard CWE546_Suspicious_Comment/*/CWE*w32*.c) $(wildcard CWE546_Suspicious_Comment/*/CWE*wchar_t*.c),$(wildcard CWE546_Suspicious_Comment/*/CWE*.c)) \
$(filter-out $(wildcard CWE547_Hardcoded_Security_Constants/*/CWE*w32*.c) $(wildcard CWE547_Hardcoded_Security_Constants/*/CWE*wchar_t*.c),$(wildcard CWE547_Hardcoded_Security_Constants/*/CWE*.c)) \
$(filter-out $(wildcard CWE560_Use_of_umask_With_chmod_Style_Argument/*/CWE*w32*.c) $(wildcard CWE560_Use_of_umask_With_chmod_Style_Argument/*/CWE*wchar_t*.c),$(wildcard CWE560_Use_of_umask_With_chmod_Style_Argument/*/CWE*.c)) \
$(filter-out $(wildcard CWE561_Dead_Code/*/CWE*w32*.c) $(wildcard CWE561_Dead_Code/*/CWE*wchar_t*.c),$(wildcard CWE561_Dead_Code/*/CWE*.c)) \
$(filter-out $(wildcard CWE562_Return_of_Stack_Variable_Address/*/CWE*w32*.c) $(wildcard CWE562_Return_of_Stack_Variable_Address/*/CWE*wchar_t*.c),$(wildcard CWE562_Return_of_Stack_Variable_Address/*/CWE*.c)) \
$(filter-out $(wildcard CWE563_Unused_Variable/*/CWE*w32*.c) $(wildcard CWE563_Unused_Variable/*/CWE*wchar_t*.c),$(wildcard CWE563_Unused_Variable/*/CWE*.c)) \
$(filter-out $(wildcard CWE570_Expression_Always_False/*/CWE*w32*.c) $(wildcard CWE570_Expression_Always_False/*/CWE*wchar_t*.c),$(wildcard CWE570_Expression_Always_False/*/CWE*.c)) \
$(filter-out $(wildcard CWE571_Expression_Always_True/*/CWE*w32*.c) $(wildcard CWE571_Expression_Always_True/*/CWE*wchar_t*.c),$(wildcard CWE571_Expression_Always_True/*/CWE*.c)) \
$(filter-out $(wildcard CWE587_Assignment_of_Fixed_Address_to_Pointer/*/CWE*w32*.c) $(wildcard CWE587_Assignment_of_Fixed_Address_to_Pointer/*/CWE*wchar_t*.c),$(wildcard CWE587_Assignment_of_Fixed_Address_to_Pointer/*/CWE*.c)) \
$(filter-out $(wildcard CWE588_Attempt_to_Access_Child_of_Non_Structure_Pointer/*/CWE*w32*.c) $(wildcard CWE588_Attempt_to_Access_Child_of_Non_Structure_Pointer/*/CWE*wchar_t*.c),$(wildcard CWE588_Attempt_to_Access_Child_of_Non_Structure_Pointer/*/CWE*.c)) \
$(filter-out $(wildcard CWE590_Free_Memory_Not_on_Heap/*/CWE*w32*.c) $(wildcard CWE590_Free_Memory_Not_on_Heap/*/CWE*wchar_t*.c),$(wildcard CWE590_Free_Memory_Not_on_Heap/*/CWE*.c)) \
$(filter-out $(wildcard CWE591_Sensitive_Data_Storage_in_Improperly_Locked_Memory/*/CWE*w32*.c) $(wildcard CWE591_Sensitive_Data_Storage_in_Improperly_Locked_Memory/*/CWE*wchar_t*.c),$(wildcard CWE591_Sensitive_Data_Storage_in_Improperly_Locked_Memory/*/CWE*.c)) \
$(filter-out $(wildcard CWE605_Multiple_Binds_Same_Port/*/CWE*w32*.c) $(wildcard CWE605_Multiple_Binds_Same_Port/*/CWE*wchar_t*.c),$(wildcard CWE605_Multiple_Binds_Same_Port/*/CWE*.c)) \
$(filter-out $(wildcard CWE606_Unchecked_Loop_Condition/*/CWE*w32*.c) $(wildcard CWE606_Unchecked_Loop_Condition/*/CWE*wchar_t*.c),$(wildcard CWE606_Unchecked_Loop_Condition/*/CWE*.c)) \
$(filter-out $(wildcard CWE617_Reachable_Assertion/*/CWE*w32*.c) $(wildcard CWE617_Reachable_Assertion/*/CWE*wchar_t*.c),$(wildcard CWE617_Reachable_Assertion/*/CWE*.c)) \
$(filter-out $(wildcard CWE620_Unverified_Password_Change/*/CWE*w32*.c) $(wildcard CWE620_Unverified_Password_Change/*/CWE*wchar_t*.c),$(wildcard CWE620_Unverified_Password_Change/*/CWE*.c)) \
$(filter-out $(wildcard CWE665_Improper_Initialization/*/CWE*w32*.c) $(wildcard CWE665_Improper_Initialization/*/CWE*wchar_t*.c),$(wildcard CWE665_Improper_Initialization/*/CWE*.c)) \
$(filter-out $(wildcard CWE666_Operation_on_Resource_in_Wrong_Phase_of_Lifetime/*/CWE*w32*.c) $(wildcard CWE666_Operation_on_Resource_in_Wrong_Phase_of_Lifetime/*/CWE*wchar_t*.c),$(wildcard CWE666_Operation_on_Resource_in_Wrong_Phase_of_Lifetime/*/CWE*.c)) \
$(filter-out $(wildcard CWE672_Operation_on_Resource_After_Expiration_or_Release/*/CWE*w32*.c) $(wildcard CWE672_Operation_on_Resource_After_Expiration_or_Release/*/CWE*wchar_t*.c),$(wildcard CWE672_Operation_on_Resource_After_Expiration_or_Release/*/CWE*.c)) \
$(filter-out $(wildcard CWE674_Uncontrolled_Recursion/*/CWE*w32*.c) $(wildcard CWE674_Uncontrolled_Recursion/*/CWE*wchar_t*.c),$(wildcard CWE674_Uncontrolled_Recursion/*/CWE*.c)) \
$(filter-out $(wildcard CWE675_Duplicate_Operations_on_Resource/*/CWE*w32*.c) $(wildcard CWE675_Duplicate_Operations_on_Resource/*/CWE*wchar_t*.c),$(wildcard CWE675_Duplicate_Operations_on_Resource/*/CWE*.c)) \
$(filter-out $(wildcard CWE676_Use_of_Potentially_Dangerous_Function/*/CWE*w32*.c) $(wildcard CWE676_Use_of_Potentially_Dangerous_Function/*/CWE*wchar_t*.c),$(wildcard CWE676_Use_of_Potentially_Dangerous_Function/*/CWE*.c)) \
$(filter-out $(wildcard CWE680_Integer_Overflow_to_Buffer_Overflow/*/CWE*w32*.c) $(wildcard CWE680_Integer_Overflow_to_Buffer_Overflow/*/CWE*wchar_t*.c),$(wildcard CWE680_Integer_Overflow_to_Buffer_Overflow/*/CWE*.c)) \
$(filter-out $(wildcard CWE685_Function_Call_With_Incorrect_Number_of_Arguments/*/CWE*w32*.c) $(wildcard CWE685_Function_Call_With_Incorrect_Number_of_Arguments/*/CWE*wchar_t*.c),$(wildcard CWE685_Function_Call_With_Incorrect_Number_of_Arguments/*/CWE*.c)) \
$(filter-out $(wildcard CWE688_Function_Call_With_Incorrect_Variable_or_Reference_as_Argument/*/CWE*w32*.c) $(wildcard CWE688_Function_Call_With_Incorrect_Variable_or_Reference_as_Argument/*/CWE*wchar_t*.c),$(wildcard CWE688_Function_Call_With_Incorrect_Variable_or_Reference_as_Argument/*/CWE*.c)) \
$(filter-out $(wildcard CWE690_NULL_Deref_From_Return/*/CWE*w32*.c) $(wildcard CWE690_NULL_Deref_From_Return/*/CWE*wchar_t*.c),$(wildcard CWE690_NULL_Deref_From_Return/*/CWE*.c)) \
$(filter-out $(wildcard CWE758_Undefined_Behavior/*/CWE*w32*.c) $(wildcard CWE758_Undefined_Behavior/*/CWE*wchar_t*.c),$(wildcard CWE758_Undefined_Behavior/*/CWE*.c)) \
$(filter-out $(wildcard CWE761_Free_Pointer_Not_at_Start_of_Buffer/*/CWE*w32*.c) $(wildcard CWE761_Free_Pointer_Not_at_Start_of_Buffer/*/CWE*wchar_t*.c),$(wildcard CWE761_Free_Pointer_Not_at_Start_of_Buffer/*/CWE*.c)) \
$(filter-out $(wildcard CWE762_Mismatched_Memory_Management_Routines/*/CWE*w32*.c) $(wildcard CWE762_Mismatched_Memory_Management_Routines/*/CWE*wchar_t*.c),$(wildcard CWE762_Mismatched_Memory_Management_Routines/*/CWE*.c)) \
$(filter-out $(wildcard CWE773_Missing_Reference_to_Active_File_Descriptor_or_Handle/*/CWE*w32*.c) $(wildcard CWE773_Missing_Reference_to_Active_File_Descriptor_or_Handle/*/CWE*wchar_t*.c),$(wildcard CWE773_Missing_Reference_to_Active_File_Descriptor_or_Handle/*/CWE*.c)) \
$(filter-out $(wildcard CWE775_Missing_Release_of_File_Descriptor_or_Handle/*/CWE*w32*.c) $(wildcard CWE775_Missing_Release_of_File_Descriptor_or_Handle/*/CWE*wchar_t*.c),$(wildcard CWE775_Missing_Release_of_File_Descriptor_or_Handle/*/CWE*.c)) \
$(filter-out $(wildcard CWE780_Use_of_RSA_Algorithm_Without_OAEP/*/CWE*w32*.c) $(wildcard CWE780_Use_of_RSA_Algorithm_Without_OAEP/*/CWE*wchar_t*.c),$(wildcard CWE780_Use_of_RSA_Algorithm_Without_OAEP/*/CWE*.c)) \
$(filter-out $(wildcard CWE785_Path_Manipulation_Function_Without_Max_Sized_Buffer/*/CWE*w32*.c) $(wildcard CWE785_Path_Manipulation_Function_Without_Max_Sized_Buffer/*/CWE*wchar_t*.c),$(wildcard CWE785_Path_Manipulation_Function_Without_Max_Sized_Buffer/*/CWE*.c)) \
$(filter-out $(wildcard CWE789_Uncontrolled_Mem_Alloc/*/CWE*w32*.c) $(wildcard CWE789_Uncontrolled_Mem_Alloc/*/CWE*wchar_t*.c),$(wildcard CWE789_Uncontrolled_Mem_Alloc/*/CWE*.c)) \
$(filter-out $(wildcard CWE78_OS_Command_Injection/*/CWE*w32*.c) $(wildcard CWE78_OS_Command_Injection/*/CWE*wchar_t*.c),$(wildcard CWE78_OS_Command_Injection/*/CWE*.c)) \
$(filter-out $(wildcard CWE832_Unlock_of_Resource_That_is_Not_Locked/*/CWE*w32*.c) $(wildcard CWE832_Unlock_of_Resource_That_is_Not_Locked/*/CWE*wchar_t*.c),$(wildcard CWE832_Unlock_of_Resource_That_is_Not_Locked/*/CWE*.c)) \
$(filter-out $(wildcard CWE835_Infinite_Loop/*/CWE*w32*.c) $(wildcard CWE835_Infinite_Loop/*/CWE*wchar_t*.c),$(wildcard CWE835_Infinite_Loop/*/CWE*.c)) \
$(filter-out $(wildcard CWE843_Type_Confusion/*/CWE*w32*.c) $(wildcard CWE843_Type_Confusion/*/CWE*wchar_t*.c),$(wildcard CWE843_Type_Confusion/*/CWE*.c)) 
C_OBJECTS=$(C_SOURCES:.c=.o)

# only grab the .cpp files without "w32" or "wchar_t" in the name
CPP_SOURCES=$(filter-out $(wildcard CWE114_Process_Control/*/CWE*w32*.cpp) $(wildcard CWE114_Process_Control/*/CWE*wchar_t*.cpp),$(wildcard CWE114_Process_Control/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE121_Stack_Based_Buffer_Overflow/*/CWE*w32*.cpp) $(wildcard CWE121_Stack_Based_Buffer_Overflow/*/CWE*wchar_t*.cpp),$(wildcard CWE121_Stack_Based_Buffer_Overflow/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE122_Heap_Based_Buffer_Overflow/*/CWE*w32*.cpp) $(wildcard CWE122_Heap_Based_Buffer_Overflow/*/CWE*wchar_t*.cpp),$(wildcard CWE122_Heap_Based_Buffer_Overflow/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE123_Write_What_Where_Condition/*/CWE*w32*.cpp) $(wildcard CWE123_Write_What_Where_Condition/*/CWE*wchar_t*.cpp),$(wildcard CWE123_Write_What_Where_Condition/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE124_Buffer_Underwrite/*/CWE*w32*.cpp) $(wildcard CWE124_Buffer_Underwrite/*/CWE*wchar_t*.cpp),$(wildcard CWE124_Buffer_Underwrite/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE126_Buffer_Overread/*/CWE*w32*.cpp) $(wildcard CWE126_Buffer_Overread/*/CWE*wchar_t*.cpp),$(wildcard CWE126_Buffer_Overread/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE127_Buffer_Underread/*/CWE*w32*.cpp) $(wildcard CWE127_Buffer_Underread/*/CWE*wchar_t*.cpp),$(wildcard CWE127_Buffer_Underread/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE134_Uncontrolled_Format_String/*/CWE*w32*.cpp) $(wildcard CWE134_Uncontrolled_Format_String/*/CWE*wchar_t*.cpp),$(wildcard CWE134_Uncontrolled_Format_String/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE15_External_Control_of_System_or_Configuration_Setting/*/CWE*w32*.cpp) $(wildcard CWE15_External_Control_of_System_or_Configuration_Setting/*/CWE*wchar_t*.cpp),$(wildcard CWE15_External_Control_of_System_or_Configuration_Setting/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE188_Reliance_on_Data_Memory_Layout/*/CWE*w32*.cpp) $(wildcard CWE188_Reliance_on_Data_Memory_Layout/*/CWE*wchar_t*.cpp),$(wildcard CWE188_Reliance_on_Data_Memory_Layout/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE190_Integer_Overflow/*/CWE*w32*.cpp) $(wildcard CWE190_Integer_Overflow/*/CWE*wchar_t*.cpp),$(wildcard CWE190_Integer_Overflow/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE191_Integer_Underflow/*/CWE*w32*.cpp) $(wildcard CWE191_Integer_Underflow/*/CWE*wchar_t*.cpp),$(wildcard CWE191_Integer_Underflow/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE194_Unexpected_Sign_Extension/*/CWE*w32*.cpp) $(wildcard CWE194_Unexpected_Sign_Extension/*/CWE*wchar_t*.cpp),$(wildcard CWE194_Unexpected_Sign_Extension/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE195_Signed_to_Unsigned_Conversion_Error/*/CWE*w32*.cpp) $(wildcard CWE195_Signed_to_Unsigned_Conversion_Error/*/CWE*wchar_t*.cpp),$(wildcard CWE195_Signed_to_Unsigned_Conversion_Error/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE196_Unsigned_to_Signed_Conversion_Error/*/CWE*w32*.cpp) $(wildcard CWE196_Unsigned_to_Signed_Conversion_Error/*/CWE*wchar_t*.cpp),$(wildcard CWE196_Unsigned_to_Signed_Conversion_Error/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE197_Numeric_Truncation_Error/*/CWE*w32*.cpp) $(wildcard CWE197_Numeric_Truncation_Error/*/CWE*wchar_t*.cpp),$(wildcard CWE197_Numeric_Truncation_Error/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE204_Response_Discrepancy_Information_Exposure/*/CWE*w32*.cpp) $(wildcard CWE204_Response_Discrepancy_Information_Exposure/*/CWE*wchar_t*.cpp),$(wildcard CWE204_Response_Discrepancy_Information_Exposure/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE222_Truncation_of_Security_Relevant_Information/*/CWE*w32*.cpp) $(wildcard CWE222_Truncation_of_Security_Relevant_Information/*/CWE*wchar_t*.cpp),$(wildcard CWE222_Truncation_of_Security_Relevant_Information/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE223_Omission_of_Security_Relevant_Information/*/CWE*w32*.cpp) $(wildcard CWE223_Omission_of_Security_Relevant_Information/*/CWE*wchar_t*.cpp),$(wildcard CWE223_Omission_of_Security_Relevant_Information/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE226_Sensitive_Information_Uncleared_Before_Release/*/CWE*w32*.cpp) $(wildcard CWE226_Sensitive_Information_Uncleared_Before_Release/*/CWE*wchar_t*.cpp),$(wildcard CWE226_Sensitive_Information_Uncleared_Before_Release/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE23_Relative_Path_Traversal/*/CWE*w32*.cpp) $(wildcard CWE23_Relative_Path_Traversal/*/CWE*wchar_t*.cpp),$(wildcard CWE23_Relative_Path_Traversal/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE242_Use_of_Inherently_Dangerous_Function/*/CWE*w32*.cpp) $(wildcard CWE242_Use_of_Inherently_Dangerous_Function/*/CWE*wchar_t*.cpp),$(wildcard CWE242_Use_of_Inherently_Dangerous_Function/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE244_Heap_Inspection/*/CWE*w32*.cpp) $(wildcard CWE244_Heap_Inspection/*/CWE*wchar_t*.cpp),$(wildcard CWE244_Heap_Inspection/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE247_Reliance_on_DNS_Lookups_in_Security_Decision/*/CWE*w32*.cpp) $(wildcard CWE247_Reliance_on_DNS_Lookups_in_Security_Decision/*/CWE*wchar_t*.cpp),$(wildcard CWE247_Reliance_on_DNS_Lookups_in_Security_Decision/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE252_Unchecked_Return_Value/*/CWE*w32*.cpp) $(wildcard CWE252_Unchecked_Return_Value/*/CWE*wchar_t*.cpp),$(wildcard CWE252_Unchecked_Return_Value/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE253_Incorrect_Check_of_Function_Return_Value/*/CWE*w32*.cpp) $(wildcard CWE253_Incorrect_Check_of_Function_Return_Value/*/CWE*wchar_t*.cpp),$(wildcard CWE253_Incorrect_Check_of_Function_Return_Value/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE256_Plaintext_Storage_of_Password/*/CWE*w32*.cpp) $(wildcard CWE256_Plaintext_Storage_of_Password/*/CWE*wchar_t*.cpp),$(wildcard CWE256_Plaintext_Storage_of_Password/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE259_Hard_Coded_Password/*/CWE*w32*.cpp) $(wildcard CWE259_Hard_Coded_Password/*/CWE*wchar_t*.cpp),$(wildcard CWE259_Hard_Coded_Password/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE272_Least_Privilege_Violation/*/CWE*w32*.cpp) $(wildcard CWE272_Least_Privilege_Violation/*/CWE*wchar_t*.cpp),$(wildcard CWE272_Least_Privilege_Violation/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE273_Improper_Check_for_Dropped_Privileges/*/CWE*w32*.cpp) $(wildcard CWE273_Improper_Check_for_Dropped_Privileges/*/CWE*wchar_t*.cpp),$(wildcard CWE273_Improper_Check_for_Dropped_Privileges/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE284_Improper_Access_Control/*/CWE*w32*.cpp) $(wildcard CWE284_Improper_Access_Control/*/CWE*wchar_t*.cpp),$(wildcard CWE284_Improper_Access_Control/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE304_Missing_Authentication_Step/*/CWE*w32*.cpp) $(wildcard CWE304_Missing_Authentication_Step/*/CWE*wchar_t*.cpp),$(wildcard CWE304_Missing_Authentication_Step/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE319_Cleartext_Tx_Sensitive_Info/*/CWE*w32*.cpp) $(wildcard CWE319_Cleartext_Tx_Sensitive_Info/*/CWE*wchar_t*.cpp),$(wildcard CWE319_Cleartext_Tx_Sensitive_Info/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE321_Hard_Coded_Cryptographic_Key/*/CWE*w32*.cpp) $(wildcard CWE321_Hard_Coded_Cryptographic_Key/*/CWE*wchar_t*.cpp),$(wildcard CWE321_Hard_Coded_Cryptographic_Key/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE325_Missing_Required_Cryptographic_Step/*/CWE*w32*.cpp) $(wildcard CWE325_Missing_Required_Cryptographic_Step/*/CWE*wchar_t*.cpp),$(wildcard CWE325_Missing_Required_Cryptographic_Step/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE327_Use_Broken_Crypto/*/CWE*w32*.cpp) $(wildcard CWE327_Use_Broken_Crypto/*/CWE*wchar_t*.cpp),$(wildcard CWE327_Use_Broken_Crypto/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE328_Reversible_One_Way_Hash/*/CWE*w32*.cpp) $(wildcard CWE328_Reversible_One_Way_Hash/*/CWE*wchar_t*.cpp),$(wildcard CWE328_Reversible_One_Way_Hash/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE338_Weak_PRNG/*/CWE*w32*.cpp) $(wildcard CWE338_Weak_PRNG/*/CWE*wchar_t*.cpp),$(wildcard CWE338_Weak_PRNG/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE364_Signal_Handler_Race_Condition/*/CWE*w32*.cpp) $(wildcard CWE364_Signal_Handler_Race_Condition/*/CWE*wchar_t*.cpp),$(wildcard CWE364_Signal_Handler_Race_Condition/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE366_Race_Condition_Within_Thread/*/CWE*w32*.cpp) $(wildcard CWE366_Race_Condition_Within_Thread/*/CWE*wchar_t*.cpp),$(wildcard CWE366_Race_Condition_Within_Thread/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE367_TOC_TOU/*/CWE*w32*.cpp) $(wildcard CWE367_TOC_TOU/*/CWE*wchar_t*.cpp),$(wildcard CWE367_TOC_TOU/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE369_Divide_by_Zero/*/CWE*w32*.cpp) $(wildcard CWE369_Divide_by_Zero/*/CWE*wchar_t*.cpp),$(wildcard CWE369_Divide_by_Zero/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE36_Absolute_Path_Traversal/*/CWE*w32*.cpp) $(wildcard CWE36_Absolute_Path_Traversal/*/CWE*wchar_t*.cpp),$(wildcard CWE36_Absolute_Path_Traversal/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE374_Passing_Mutable_Objects_to_Untrusted_Method/*/CWE*w32*.cpp) $(wildcard CWE374_Passing_Mutable_Objects_to_Untrusted_Method/*/CWE*wchar_t*.cpp),$(wildcard CWE374_Passing_Mutable_Objects_to_Untrusted_Method/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE377_Insecure_Temporary_File/*/CWE*w32*.cpp) $(wildcard CWE377_Insecure_Temporary_File/*/CWE*wchar_t*.cpp),$(wildcard CWE377_Insecure_Temporary_File/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE390_Error_Without_Action/*/CWE*w32*.cpp) $(wildcard CWE390_Error_Without_Action/*/CWE*wchar_t*.cpp),$(wildcard CWE390_Error_Without_Action/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE391_Unchecked_Error_Condition/*/CWE*w32*.cpp) $(wildcard CWE391_Unchecked_Error_Condition/*/CWE*wchar_t*.cpp),$(wildcard CWE391_Unchecked_Error_Condition/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE392_Missing_Report_of_Error_Condition/*/CWE*w32*.cpp) $(wildcard CWE392_Missing_Report_of_Error_Condition/*/CWE*wchar_t*.cpp),$(wildcard CWE392_Missing_Report_of_Error_Condition/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE396_Catch_Generic_Exception/*/CWE*w32*.cpp) $(wildcard CWE396_Catch_Generic_Exception/*/CWE*wchar_t*.cpp),$(wildcard CWE396_Catch_Generic_Exception/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE397_Throw_Generic_Exception/*/CWE*w32*.cpp) $(wildcard CWE397_Throw_Generic_Exception/*/CWE*wchar_t*.cpp),$(wildcard CWE397_Throw_Generic_Exception/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE398_Poor_Code_Quality/*/CWE*w32*.cpp) $(wildcard CWE398_Poor_Code_Quality/*/CWE*wchar_t*.cpp),$(wildcard CWE398_Poor_Code_Quality/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE400_Resource_Exhaustion/*/CWE*w32*.cpp) $(wildcard CWE400_Resource_Exhaustion/*/CWE*wchar_t*.cpp),$(wildcard CWE400_Resource_Exhaustion/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE401_Memory_Leak/*/CWE*w32*.cpp) $(wildcard CWE401_Memory_Leak/*/CWE*wchar_t*.cpp),$(wildcard CWE401_Memory_Leak/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE404_Improper_Resource_Shutdown/*/CWE*w32*.cpp) $(wildcard CWE404_Improper_Resource_Shutdown/*/CWE*wchar_t*.cpp),$(wildcard CWE404_Improper_Resource_Shutdown/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE415_Double_Free/*/CWE*w32*.cpp) $(wildcard CWE415_Double_Free/*/CWE*wchar_t*.cpp),$(wildcard CWE415_Double_Free/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE416_Use_After_Free/*/CWE*w32*.cpp) $(wildcard CWE416_Use_After_Free/*/CWE*wchar_t*.cpp),$(wildcard CWE416_Use_After_Free/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE426_Untrusted_Search_Path/*/CWE*w32*.cpp) $(wildcard CWE426_Untrusted_Search_Path/*/CWE*wchar_t*.cpp),$(wildcard CWE426_Untrusted_Search_Path/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE427_Uncontrolled_Search_Path_Element/*/CWE*w32*.cpp) $(wildcard CWE427_Uncontrolled_Search_Path_Element/*/CWE*wchar_t*.cpp),$(wildcard CWE427_Uncontrolled_Search_Path_Element/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE440_Expected_Behavior_Violation/*/CWE*w32*.cpp) $(wildcard CWE440_Expected_Behavior_Violation/*/CWE*wchar_t*.cpp),$(wildcard CWE440_Expected_Behavior_Violation/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE457_Use_of_Uninitialized_Variable/*/CWE*w32*.cpp) $(wildcard CWE457_Use_of_Uninitialized_Variable/*/CWE*wchar_t*.cpp),$(wildcard CWE457_Use_of_Uninitialized_Variable/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE459_Incomplete_Cleanup/*/CWE*w32*.cpp) $(wildcard CWE459_Incomplete_Cleanup/*/CWE*wchar_t*.cpp),$(wildcard CWE459_Incomplete_Cleanup/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE464_Addition_of_Data_Structure_Sentinel/*/CWE*w32*.cpp) $(wildcard CWE464_Addition_of_Data_Structure_Sentinel/*/CWE*wchar_t*.cpp),$(wildcard CWE464_Addition_of_Data_Structure_Sentinel/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE467_Use_of_sizeof_on_Pointer_Type/*/CWE*w32*.cpp) $(wildcard CWE467_Use_of_sizeof_on_Pointer_Type/*/CWE*wchar_t*.cpp),$(wildcard CWE467_Use_of_sizeof_on_Pointer_Type/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE468_Incorrect_Pointer_Scaling/*/CWE*w32*.cpp) $(wildcard CWE468_Incorrect_Pointer_Scaling/*/CWE*wchar_t*.cpp),$(wildcard CWE468_Incorrect_Pointer_Scaling/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE469_Use_of_Pointer_Subtraction_to_Determine_Size/*/CWE*w32*.cpp) $(wildcard CWE469_Use_of_Pointer_Subtraction_to_Determine_Size/*/CWE*wchar_t*.cpp),$(wildcard CWE469_Use_of_Pointer_Subtraction_to_Determine_Size/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE475_Undefined_Behavior_for_Input_to_API/*/CWE*w32*.cpp) $(wildcard CWE475_Undefined_Behavior_for_Input_to_API/*/CWE*wchar_t*.cpp),$(wildcard CWE475_Undefined_Behavior_for_Input_to_API/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE476_NULL_Pointer_Dereference/*/CWE*w32*.cpp) $(wildcard CWE476_NULL_Pointer_Dereference/*/CWE*wchar_t*.cpp),$(wildcard CWE476_NULL_Pointer_Dereference/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE478_Missing_Default_Case_in_Switch/*/CWE*w32*.cpp) $(wildcard CWE478_Missing_Default_Case_in_Switch/*/CWE*wchar_t*.cpp),$(wildcard CWE478_Missing_Default_Case_in_Switch/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE479_Signal_Handler_Use_of_Non_Reentrant_Function/*/CWE*w32*.cpp) $(wildcard CWE479_Signal_Handler_Use_of_Non_Reentrant_Function/*/CWE*wchar_t*.cpp),$(wildcard CWE479_Signal_Handler_Use_of_Non_Reentrant_Function/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE480_Use_of_Incorrect_Operator/*/CWE*w32*.cpp) $(wildcard CWE480_Use_of_Incorrect_Operator/*/CWE*wchar_t*.cpp),$(wildcard CWE480_Use_of_Incorrect_Operator/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE481_Assigning_Instead_of_Comparing/*/CWE*w32*.cpp) $(wildcard CWE481_Assigning_Instead_of_Comparing/*/CWE*wchar_t*.cpp),$(wildcard CWE481_Assigning_Instead_of_Comparing/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE482_Comparing_Instead_of_Assigning/*/CWE*w32*.cpp) $(wildcard CWE482_Comparing_Instead_of_Assigning/*/CWE*wchar_t*.cpp),$(wildcard CWE482_Comparing_Instead_of_Assigning/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE483_Incorrect_Block_Delimitation/*/CWE*w32*.cpp) $(wildcard CWE483_Incorrect_Block_Delimitation/*/CWE*wchar_t*.cpp),$(wildcard CWE483_Incorrect_Block_Delimitation/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE484_Omitted_Break_Statement_in_Switch/*/CWE*w32*.cpp) $(wildcard CWE484_Omitted_Break_Statement_in_Switch/*/CWE*wchar_t*.cpp),$(wildcard CWE484_Omitted_Break_Statement_in_Switch/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE489_Leftover_Debug_Code/*/CWE*w32*.cpp) $(wildcard CWE489_Leftover_Debug_Code/*/CWE*wchar_t*.cpp),$(wildcard CWE489_Leftover_Debug_Code/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE500_Public_Static_Field_Not_Final/*/CWE*w32*.cpp) $(wildcard CWE500_Public_Static_Field_Not_Final/*/CWE*wchar_t*.cpp),$(wildcard CWE500_Public_Static_Field_Not_Final/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE506_Embedded_Malicious_Code/*/CWE*w32*.cpp) $(wildcard CWE506_Embedded_Malicious_Code/*/CWE*wchar_t*.cpp),$(wildcard CWE506_Embedded_Malicious_Code/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE510_Trapdoor/*/CWE*w32*.cpp) $(wildcard CWE510_Trapdoor/*/CWE*wchar_t*.cpp),$(wildcard CWE510_Trapdoor/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE511_Logic_Time_Bomb/*/CWE*w32*.cpp) $(wildcard CWE511_Logic_Time_Bomb/*/CWE*wchar_t*.cpp),$(wildcard CWE511_Logic_Time_Bomb/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE534_Info_Exposure_Debug_Log/*/CWE*w32*.cpp) $(wildcard CWE534_Info_Exposure_Debug_Log/*/CWE*wchar_t*.cpp),$(wildcard CWE534_Info_Exposure_Debug_Log/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE535_Info_Exposure_Shell_Error/*/CWE*w32*.cpp) $(wildcard CWE535_Info_Exposure_Shell_Error/*/CWE*wchar_t*.cpp),$(wildcard CWE535_Info_Exposure_Shell_Error/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE546_Suspicious_Comment/*/CWE*w32*.cpp) $(wildcard CWE546_Suspicious_Comment/*/CWE*wchar_t*.cpp),$(wildcard CWE546_Suspicious_Comment/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE547_Hardcoded_Security_Constants/*/CWE*w32*.cpp) $(wildcard CWE547_Hardcoded_Security_Constants/*/CWE*wchar_t*.cpp),$(wildcard CWE547_Hardcoded_Security_Constants/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE560_Use_of_umask_With_chmod_Style_Argument/*/CWE*w32*.cpp) $(wildcard CWE560_Use_of_umask_With_chmod_Style_Argument/*/CWE*wchar_t*.cpp),$(wildcard CWE560_Use_of_umask_With_chmod_Style_Argument/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE561_Dead_Code/*/CWE*w32*.cpp) $(wildcard CWE561_Dead_Code/*/CWE*wchar_t*.cpp),$(wildcard CWE561_Dead_Code/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE562_Return_of_Stack_Variable_Address/*/CWE*w32*.cpp) $(wildcard CWE562_Return_of_Stack_Variable_Address/*/CWE*wchar_t*.cpp),$(wildcard CWE562_Return_of_Stack_Variable_Address/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE563_Unused_Variable/*/CWE*w32*.cpp) $(wildcard CWE563_Unused_Variable/*/CWE*wchar_t*.cpp),$(wildcard CWE563_Unused_Variable/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE570_Expression_Always_False/*/CWE*w32*.cpp) $(wildcard CWE570_Expression_Always_False/*/CWE*wchar_t*.cpp),$(wildcard CWE570_Expression_Always_False/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE571_Expression_Always_True/*/CWE*w32*.cpp) $(wildcard CWE571_Expression_Always_True/*/CWE*wchar_t*.cpp),$(wildcard CWE571_Expression_Always_True/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE587_Assignment_of_Fixed_Address_to_Pointer/*/CWE*w32*.cpp) $(wildcard CWE587_Assignment_of_Fixed_Address_to_Pointer/*/CWE*wchar_t*.cpp),$(wildcard CWE587_Assignment_of_Fixed_Address_to_Pointer/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE588_Attempt_to_Access_Child_of_Non_Structure_Pointer/*/CWE*w32*.cpp) $(wildcard CWE588_Attempt_to_Access_Child_of_Non_Structure_Pointer/*/CWE*wchar_t*.cpp),$(wildcard CWE588_Attempt_to_Access_Child_of_Non_Structure_Pointer/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE590_Free_Memory_Not_on_Heap/*/CWE*w32*.cpp) $(wildcard CWE590_Free_Memory_Not_on_Heap/*/CWE*wchar_t*.cpp),$(wildcard CWE590_Free_Memory_Not_on_Heap/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE591_Sensitive_Data_Storage_in_Improperly_Locked_Memory/*/CWE*w32*.cpp) $(wildcard CWE591_Sensitive_Data_Storage_in_Improperly_Locked_Memory/*/CWE*wchar_t*.cpp),$(wildcard CWE591_Sensitive_Data_Storage_in_Improperly_Locked_Memory/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE605_Multiple_Binds_Same_Port/*/CWE*w32*.cpp) $(wildcard CWE605_Multiple_Binds_Same_Port/*/CWE*wchar_t*.cpp),$(wildcard CWE605_Multiple_Binds_Same_Port/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE606_Unchecked_Loop_Condition/*/CWE*w32*.cpp) $(wildcard CWE606_Unchecked_Loop_Condition/*/CWE*wchar_t*.cpp),$(wildcard CWE606_Unchecked_Loop_Condition/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE617_Reachable_Assertion/*/CWE*w32*.cpp) $(wildcard CWE617_Reachable_Assertion/*/CWE*wchar_t*.cpp),$(wildcard CWE617_Reachable_Assertion/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE620_Unverified_Password_Change/*/CWE*w32*.cpp) $(wildcard CWE620_Unverified_Password_Change/*/CWE*wchar_t*.cpp),$(wildcard CWE620_Unverified_Password_Change/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE665_Improper_Initialization/*/CWE*w32*.cpp) $(wildcard CWE665_Improper_Initialization/*/CWE*wchar_t*.cpp),$(wildcard CWE665_Improper_Initialization/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE666_Operation_on_Resource_in_Wrong_Phase_of_Lifetime/*/CWE*w32*.cpp) $(wildcard CWE666_Operation_on_Resource_in_Wrong_Phase_of_Lifetime/*/CWE*wchar_t*.cpp),$(wildcard CWE666_Operation_on_Resource_in_Wrong_Phase_of_Lifetime/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE672_Operation_on_Resource_After_Expiration_or_Release/*/CWE*w32*.cpp) $(wildcard CWE672_Operation_on_Resource_After_Expiration_or_Release/*/CWE*wchar_t*.cpp),$(wildcard CWE672_Operation_on_Resource_After_Expiration_or_Release/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE674_Uncontrolled_Recursion/*/CWE*w32*.cpp) $(wildcard CWE674_Uncontrolled_Recursion/*/CWE*wchar_t*.cpp),$(wildcard CWE674_Uncontrolled_Recursion/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE675_Duplicate_Operations_on_Resource/*/CWE*w32*.cpp) $(wildcard CWE675_Duplicate_Operations_on_Resource/*/CWE*wchar_t*.cpp),$(wildcard CWE675_Duplicate_Operations_on_Resource/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE676_Use_of_Potentially_Dangerous_Function/*/CWE*w32*.cpp) $(wildcard CWE676_Use_of_Potentially_Dangerous_Function/*/CWE*wchar_t*.cpp),$(wildcard CWE676_Use_of_Potentially_Dangerous_Function/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE680_Integer_Overflow_to_Buffer_Overflow/*/CWE*w32*.cpp) $(wildcard CWE680_Integer_Overflow_to_Buffer_Overflow/*/CWE*wchar_t*.cpp),$(wildcard CWE680_Integer_Overflow_to_Buffer_Overflow/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE685_Function_Call_With_Incorrect_Number_of_Arguments/*/CWE*w32*.cpp) $(wildcard CWE685_Function_Call_With_Incorrect_Number_of_Arguments/*/CWE*wchar_t*.cpp),$(wildcard CWE685_Function_Call_With_Incorrect_Number_of_Arguments/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE688_Function_Call_With_Incorrect_Variable_or_Reference_as_Argument/*/CWE*w32*.cpp) $(wildcard CWE688_Function_Call_With_Incorrect_Variable_or_Reference_as_Argument/*/CWE*wchar_t*.cpp),$(wildcard CWE688_Function_Call_With_Incorrect_Variable_or_Reference_as_Argument/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE690_NULL_Deref_From_Return/*/CWE*w32*.cpp) $(wildcard CWE690_NULL_Deref_From_Return/*/CWE*wchar_t*.cpp),$(wildcard CWE690_NULL_Deref_From_Return/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE758_Undefined_Behavior/*/CWE*w32*.cpp) $(wildcard CWE758_Undefined_Behavior/*/CWE*wchar_t*.cpp),$(wildcard CWE758_Undefined_Behavior/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE761_Free_Pointer_Not_at_Start_of_Buffer/*/CWE*w32*.cpp) $(wildcard CWE761_Free_Pointer_Not_at_Start_of_Buffer/*/CWE*wchar_t*.cpp),$(wildcard CWE761_Free_Pointer_Not_at_Start_of_Buffer/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE762_Mismatched_Memory_Management_Routines/*/CWE*w32*.cpp) $(wildcard CWE762_Mismatched_Memory_Management_Routines/*/CWE*wchar_t*.cpp),$(wildcard CWE762_Mismatched_Memory_Management_Routines/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE773_Missing_Reference_to_Active_File_Descriptor_or_Handle/*/CWE*w32*.cpp) $(wildcard CWE773_Missing_Reference_to_Active_File_Descriptor_or_Handle/*/CWE*wchar_t*.cpp),$(wildcard CWE773_Missing_Reference_to_Active_File_Descriptor_or_Handle/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE775_Missing_Release_of_File_Descriptor_or_Handle/*/CWE*w32*.cpp) $(wildcard CWE775_Missing_Release_of_File_Descriptor_or_Handle/*/CWE*wchar_t*.cpp),$(wildcard CWE775_Missing_Release_of_File_Descriptor_or_Handle/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE780_Use_of_RSA_Algorithm_Without_OAEP/*/CWE*w32*.cpp) $(wildcard CWE780_Use_of_RSA_Algorithm_Without_OAEP/*/CWE*wchar_t*.cpp),$(wildcard CWE780_Use_of_RSA_Algorithm_Without_OAEP/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE785_Path_Manipulation_Function_Without_Max_Sized_Buffer/*/CWE*w32*.cpp) $(wildcard CWE785_Path_Manipulation_Function_Without_Max_Sized_Buffer/*/CWE*wchar_t*.cpp),$(wildcard CWE785_Path_Manipulation_Function_Without_Max_Sized_Buffer/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE789_Uncontrolled_Mem_Alloc/*/CWE*w32*.cpp) $(wildcard CWE789_Uncontrolled_Mem_Alloc/*/CWE*wchar_t*.cpp),$(wildcard CWE789_Uncontrolled_Mem_Alloc/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE78_OS_Command_Injection/*/CWE*w32*.cpp) $(wildcard CWE78_OS_Command_Injection/*/CWE*wchar_t*.cpp),$(wildcard CWE78_OS_Command_Injection/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE832_Unlock_of_Resource_That_is_Not_Locked/*/CWE*w32*.cpp) $(wildcard CWE832_Unlock_of_Resource_That_is_Not_Locked/*/CWE*wchar_t*.cpp),$(wildcard CWE832_Unlock_of_Resource_That_is_Not_Locked/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE835_Infinite_Loop/*/CWE*w32*.cpp) $(wildcard CWE835_Infinite_Loop/*/CWE*wchar_t*.cpp),$(wildcard CWE835_Infinite_Loop/*/CWE*.cpp)) \
$(filter-out $(wildcard CWE843_Type_Confusion/*/CWE*w32*.cpp) $(wildcard CWE843_Type_Confusion/*/CWE*wchar_t*.cpp),$(wildcard CWE843_Type_Confusion/*/CWE*.cpp)) 
CPP_OBJECTS=$(CPP_SOURCES:.cpp=.o)

OBJECTS=$(MAIN_OBJECT) $(C_OBJECTS) $(CPP_OBJECTS) $(C_SUPPORT_OBJECTS)
TARGET=all-testcases

all: $(TARGET)

$(TARGET) : $(OBJECTS)
#	$(CPP) $(LFLAGS) $(OBJECTS) -o $(TARGET)

$(C_OBJECTS) : $(C_SOURCES)
	$(CC) $(CFLAGS) $(INCLUDES) $(@:.o=.c) -o $@

$(CPP_OBJECTS) : $(CPP_SOURCES)
	$(CC) $(CFLAGS) $(INCLUDES) $(@:.o=.cpp) -o $@

$(C_SUPPORT_OBJECTS) : $(C_SUPPORT_FILES)
	$(CC) $(CFLAGS) $(INCLUDES) $(SUPPORT_PATH)$(@:.o=.c) -o $@

$(MAIN_OBJECT) : $(MAIN)
	$(CC) $(CFLAGS) $(INCLUDES) $(MAIN) -o $@

clean:
	rm -rf *.o $(TARGET) CWE114_Process_Control/*/*.o CWE121_Stack_Based_Buffer_Overflow/*/*.o CWE122_Heap_Based_Buffer_Overflow/*/*.o CWE123_Write_What_Where_Condition/*/*.o CWE124_Buffer_Underwrite/*/*.o CWE126_Buffer_Overread/*/*.o CWE127_Buffer_Underread/*/*.o CWE134_Uncontrolled_Format_String/*/*.o CWE15_External_Control_of_System_or_Configuration_Setting/*/*.o CWE188_Reliance_on_Data_Memory_Layout/*/*.o CWE190_Integer_Overflow/*/*.o CWE191_Integer_Underflow/*/*.o CWE194_Unexpected_Sign_Extension/*/*.o CWE195_Signed_to_Unsigned_Conversion_Error/*/*.o CWE196_Unsigned_to_Signed_Conversion_Error/*/*.o CWE197_Numeric_Truncation_Error/*/*.o CWE204_Response_Discrepancy_Information_Exposure/*/*.o CWE222_Truncation_of_Security_Relevant_Information/*/*.o CWE223_Omission_of_Security_Relevant_Information/*/*.o CWE226_Sensitive_Information_Uncleared_Before_Release/*/*.o CWE23_Relative_Path_Traversal/*/*.o CWE242_Use_of_Inherently_Dangerous_Function/*/*.o CWE244_Heap_Inspection/*/*.o CWE247_Reliance_on_DNS_Lookups_in_Security_Decision/*/*.o CWE252_Unchecked_Return_Value/*/*.o CWE253_Incorrect_Check_of_Function_Return_Value/*/*.o CWE256_Plaintext_Storage_of_Password/*/*.o CWE259_Hard_Coded_Password/*/*.o CWE272_Least_Privilege_Violation/*/*.o CWE273_Improper_Check_for_Dropped_Privileges/*/*.o CWE284_Improper_Access_Control/*/*.o CWE304_Missing_Authentication_Step/*/*.o CWE319_Cleartext_Tx_Sensitive_Info/*/*.o CWE321_Hard_Coded_Cryptographic_Key/*/*.o CWE325_Missing_Required_Cryptographic_Step/*/*.o CWE327_Use_Broken_Crypto/*/*.o CWE328_Reversible_One_Way_Hash/*/*.o CWE338_Weak_PRNG/*/*.o CWE364_Signal_Handler_Race_Condition/*/*.o CWE366_Race_Condition_Within_Thread/*/*.o CWE367_TOC_TOU/*/*.o CWE369_Divide_by_Zero/*/*.o CWE36_Absolute_Path_Traversal/*/*.o CWE374_Passing_Mutable_Objects_to_Untrusted_Method/*/*.o CWE377_Insecure_Temporary_File/*/*.o CWE390_Error_Without_Action/*/*.o CWE391_Unchecked_Error_Condition/*/*.o CWE392_Missing_Report_of_Error_Condition/*/*.o CWE396_Catch_Generic_Exception/*/*.o CWE397_Throw_Generic_Exception/*/*.o CWE398_Poor_Code_Quality/*/*.o CWE400_Resource_Exhaustion/*/*.o CWE401_Memory_Leak/*/*.o CWE404_Improper_Resource_Shutdown/*/*.o CWE415_Double_Free/*/*.o CWE416_Use_After_Free/*/*.o CWE426_Untrusted_Search_Path/*/*.o CWE427_Uncontrolled_Search_Path_Element/*/*.o CWE440_Expected_Behavior_Violation/*/*.o CWE457_Use_of_Uninitialized_Variable/*/*.o CWE459_Incomplete_Cleanup/*/*.o CWE464_Addition_of_Data_Structure_Sentinel/*/*.o CWE467_Use_of_sizeof_on_Pointer_Type/*/*.o CWE468_Incorrect_Pointer_Scaling/*/*.o CWE469_Use_of_Pointer_Subtraction_to_Determine_Size/*/*.o CWE475_Undefined_Behavior_for_Input_to_API/*/*.o CWE476_NULL_Pointer_Dereference/*/*.o CWE478_Missing_Default_Case_in_Switch/*/*.o CWE479_Signal_Handler_Use_of_Non_Reentrant_Function/*/*.o CWE480_Use_of_Incorrect_Operator/*/*.o CWE481_Assigning_Instead_of_Comparing/*/*.o CWE482_Comparing_Instead_of_Assigning/*/*.o CWE483_Incorrect_Block_Delimitation/*/*.o CWE484_Omitted_Break_Statement_in_Switch/*/*.o CWE489_Leftover_Debug_Code/*/*.o CWE500_Public_Static_Field_Not_Final/*/*.o CWE506_Embedded_Malicious_Code/*/*.o CWE510_Trapdoor/*/*.o CWE511_Logic_Time_Bomb/*/*.o CWE534_Info_Exposure_Debug_Log/*/*.o CWE535_Info_Exposure_Shell_Error/*/*.o CWE546_Suspicious_Comment/*/*.o CWE547_Hardcoded_Security_Constants/*/*.o CWE560_Use_of_umask_With_chmod_Style_Argument/*/*.o CWE561_Dead_Code/*/*.o CWE562_Return_of_Stack_Variable_Address/*/*.o CWE563_Unused_Variable/*/*.o CWE570_Expression_Always_False/*/*.o CWE571_Expression_Always_True/*/*.o CWE587_Assignment_of_Fixed_Address_to_Pointer/*/*.o CWE588_Attempt_to_Access_Child_of_Non_Structure_Pointer/*/*.o CWE590_Free_Memory_Not_on_Heap/*/*.o CWE591_Sensitive_Data_Storage_in_Improperly_Locked_Memory/*/*.o CWE605_Multiple_Binds_Same_Port/*/*.o CWE606_Unchecked_Loop_Condition/*/*.o CWE617_Reachable_Assertion/*/*.o CWE620_Unverified_Password_Change/*/*.o CWE665_Improper_Initialization/*/*.o CWE666_Operation_on_Resource_in_Wrong_Phase_of_Lifetime/*/*.o CWE672_Operation_on_Resource_After_Expiration_or_Release/*/*.o CWE674_Uncontrolled_Recursion/*/*.o CWE675_Duplicate_Operations_on_Resource/*/*.o CWE676_Use_of_Potentially_Dangerous_Function/*/*.o CWE680_Integer_Overflow_to_Buffer_Overflow/*/*.o CWE685_Function_Call_With_Incorrect_Number_of_Arguments/*/*.o CWE688_Function_Call_With_Incorrect_Variable_or_Reference_as_Argument/*/*.o CWE690_NULL_Deref_From_Return/*/*.o CWE758_Undefined_Behavior/*/*.o CWE761_Free_Pointer_Not_at_Start_of_Buffer/*/*.o CWE762_Mismatched_Memory_Management_Routines/*/*.o CWE773_Missing_Reference_to_Active_File_Descriptor_or_Handle/*/*.o CWE775_Missing_Release_of_File_Descriptor_or_Handle/*/*.o CWE780_Use_of_RSA_Algorithm_Without_OAEP/*/*.o CWE785_Path_Manipulation_Function_Without_Max_Sized_Buffer/*/*.o CWE789_Uncontrolled_Mem_Alloc/*/*.o CWE78_OS_Command_Injection/*/*.o CWE832_Unlock_of_Resource_That_is_Not_Locked/*/*.o CWE835_Infinite_Loop/*/*.o CWE843_Type_Confusion/*/*.o
