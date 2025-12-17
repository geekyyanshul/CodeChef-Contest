package start217c.Make An AP;

public class  {
    
}
import java.util.*;

public class Main {

    // Computes the Greatest Common Divisor using the Euclidean Algorithm
    static long calculateGreatestCommonDivisorUsingEuclideanAlgorithm(
            long firstInputNumberForGCDCalculation,
            long secondInputNumberForGCDCalculation
    ) {
        while (secondInputNumberForGCDCalculation != 0) {

            long remainderObtainedAfterModuloOperation =
                    firstInputNumberForGCDCalculation
                            % secondInputNumberForGCDCalculation;

            firstInputNumberForGCDCalculation =
                    secondInputNumberForGCDCalculation;

            secondInputNumberForGCDCalculation =
                    remainderObtainedAfterModuloOperation;
        }

        return firstInputNumberForGCDCalculation;
    }

    public static void main(String[] args) {

        Scanner scannerObjectUsedForReadingInput = new Scanner(System.in);

        int totalNumberOfIndependentTestCasesProvided =
                scannerObjectUsedForReadingInput.nextInt();

        while (totalNumberOfIndependentTestCasesProvided-- > 0) {

            int totalNumberOfElementsInStrictlyIncreasingInputSequence =
                    scannerObjectUsedForReadingInput.nextInt();

            long[] strictlyIncreasingInputSequenceProvidedByChef =
                    new long[totalNumberOfElementsInStrictlyIncreasingInputSequence];

            for (
                int currentArrayIndexWhileReadingInput = 0;
                currentArrayIndexWhileReadingInput
                        < totalNumberOfElementsInStrictlyIncreasingInputSequence;
                currentArrayIndexWhileReadingInput++
            ) {
                strictlyIncreasingInputSequenceProvidedByChef[
                        currentArrayIndexWhileReadingInput
                ] = scannerObjectUsedForReadingInput.nextLong();
            }

            long greatestCommonDifferenceAcrossAllExistingElements = 0;

            for (
                int currentArrayIndexForDifferenceCalculation = 1;
                currentArrayIndexForDifferenceCalculation
                        < totalNumberOfElementsInStrictlyIncreasingInputSequence;
                currentArrayIndexForDifferenceCalculation++
            ) {

                long differenceBetweenCurrentElementAndFirstElement =
                        strictlyIncreasingInputSequenceProvidedByChef[
                                currentArrayIndexForDifferenceCalculation
                        ]
                        - strictlyIncreasingInputSequenceProvidedByChef[0];

                greatestCommonDifferenceAcrossAllExistingElements =
                        calculateGreatestCommonDivisorUsingEuclideanAlgorithm(
                                greatestCommonDifferenceAcrossAllExistingElements,
                                differenceBetweenCurrentElementAndFirstElement
                        );
            }

            long totalNumberOfElementsInFinalArithmeticProgressionAfterInsertions =
                    (
                        strictlyIncreasingInputSequenceProvidedByChef[
                                totalNumberOfElementsInStrictlyIncreasingInputSequence - 1
                        ]
                        - strictlyIncreasingInputSequenceProvidedByChef[0]
                    )
                    / greatestCommonDifferenceAcrossAllExistingElements
                    + 1;

            long minimumNumberOfInsertOperationsChefNeedsToPerform =
                    totalNumberOfElementsInFinalArithmeticProgressionAfterInsertions
                    - totalNumberOfElementsInStrictlyIncreasingInputSequence;

            System.out.println(minimumNumberOfInsertOperationsChefNeedsToPerform);
        }
        scannerObjectUsedForReadingInput.close();
    }
}
