package use_case.choose_genre;

public interface ChooseOutputBoundary {

    void prepareSuccessView(ChooseOutputData outputData);

    void prepareFailView(String s);
}
