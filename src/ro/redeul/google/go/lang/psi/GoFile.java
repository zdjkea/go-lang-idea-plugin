package ro.redeul.google.go.lang.psi;

import com.intellij.psi.PsiFile;
import ro.redeul.google.go.lang.psi.toplevel.*;

/**
 * Author: Toader Mihai Claudiu <mtoader@gmail.com>
 * <p/>
 * Date: Jul 24, 2010
 * Time: 7:57:28 PM
 */
public interface GoFile extends PsiFile, GoPsiElement, GoPackagedElement {

    GoFile[] EMPTY_ARRAY = new GoFile[0];

    GoPackageDeclaration getPackage();

    GoImportDeclaration[] getImportDeclarations();

    GoFunctionDeclaration[] getFunctions();

    GoMethodDeclaration[] getMethods();

    GoFunctionDeclaration getMainFunction();

    GoTypeDeclaration[] getTypeDeclarations();
}
