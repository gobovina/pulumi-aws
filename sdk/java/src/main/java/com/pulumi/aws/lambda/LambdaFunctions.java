// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lambda;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.lambda.inputs.GetAliasArgs;
import com.pulumi.aws.lambda.inputs.GetAliasPlainArgs;
import com.pulumi.aws.lambda.inputs.GetCodeSigningConfigArgs;
import com.pulumi.aws.lambda.inputs.GetCodeSigningConfigPlainArgs;
import com.pulumi.aws.lambda.inputs.GetFunctionArgs;
import com.pulumi.aws.lambda.inputs.GetFunctionPlainArgs;
import com.pulumi.aws.lambda.inputs.GetFunctionUrlArgs;
import com.pulumi.aws.lambda.inputs.GetFunctionUrlPlainArgs;
import com.pulumi.aws.lambda.inputs.GetInvocationArgs;
import com.pulumi.aws.lambda.inputs.GetInvocationPlainArgs;
import com.pulumi.aws.lambda.inputs.GetLayerVersionArgs;
import com.pulumi.aws.lambda.inputs.GetLayerVersionPlainArgs;
import com.pulumi.aws.lambda.outputs.GetAliasResult;
import com.pulumi.aws.lambda.outputs.GetCodeSigningConfigResult;
import com.pulumi.aws.lambda.outputs.GetFunctionResult;
import com.pulumi.aws.lambda.outputs.GetFunctionUrlResult;
import com.pulumi.aws.lambda.outputs.GetInvocationResult;
import com.pulumi.aws.lambda.outputs.GetLayerVersionResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class LambdaFunctions {
    /**
     * Provides information about a Lambda Alias.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.lambda.LambdaFunctions;
     * import com.pulumi.aws.lambda.inputs.GetAliasArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var production = LambdaFunctions.getAlias(GetAliasArgs.builder()
     *             .functionName(&#34;my-lambda-func&#34;)
     *             .name(&#34;production&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetAliasResult> getAlias(GetAliasArgs args) {
        return getAlias(args, InvokeOptions.Empty);
    }
    /**
     * Provides information about a Lambda Alias.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.lambda.LambdaFunctions;
     * import com.pulumi.aws.lambda.inputs.GetAliasArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var production = LambdaFunctions.getAlias(GetAliasArgs.builder()
     *             .functionName(&#34;my-lambda-func&#34;)
     *             .name(&#34;production&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetAliasResult> getAliasPlain(GetAliasPlainArgs args) {
        return getAliasPlain(args, InvokeOptions.Empty);
    }
    /**
     * Provides information about a Lambda Alias.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.lambda.LambdaFunctions;
     * import com.pulumi.aws.lambda.inputs.GetAliasArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var production = LambdaFunctions.getAlias(GetAliasArgs.builder()
     *             .functionName(&#34;my-lambda-func&#34;)
     *             .name(&#34;production&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetAliasResult> getAlias(GetAliasArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:lambda/getAlias:getAlias", TypeShape.of(GetAliasResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides information about a Lambda Alias.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.lambda.LambdaFunctions;
     * import com.pulumi.aws.lambda.inputs.GetAliasArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var production = LambdaFunctions.getAlias(GetAliasArgs.builder()
     *             .functionName(&#34;my-lambda-func&#34;)
     *             .name(&#34;production&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetAliasResult> getAliasPlain(GetAliasPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:lambda/getAlias:getAlias", TypeShape.of(GetAliasResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides information about a Lambda Code Signing Config. A code signing configuration defines a list of allowed signing profiles and defines the code-signing validation policy (action to be taken if deployment validation checks fail).
     * 
     * For information about Lambda code signing configurations and how to use them, see [configuring code signing for Lambda functions](https://docs.aws.amazon.com/lambda/latest/dg/configuration-codesigning.html)
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.lambda.LambdaFunctions;
     * import com.pulumi.aws.lambda.inputs.GetCodeSigningConfigArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var existingCsc = LambdaFunctions.getCodeSigningConfig(GetCodeSigningConfigArgs.builder()
     *             .arn(String.format(&#34;arn:aws:lambda:%s:%s:code-signing-config:csc-0f6c334abcdea4d8b&#34;, var_.aws_region(),var_.aws_account()))
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetCodeSigningConfigResult> getCodeSigningConfig(GetCodeSigningConfigArgs args) {
        return getCodeSigningConfig(args, InvokeOptions.Empty);
    }
    /**
     * Provides information about a Lambda Code Signing Config. A code signing configuration defines a list of allowed signing profiles and defines the code-signing validation policy (action to be taken if deployment validation checks fail).
     * 
     * For information about Lambda code signing configurations and how to use them, see [configuring code signing for Lambda functions](https://docs.aws.amazon.com/lambda/latest/dg/configuration-codesigning.html)
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.lambda.LambdaFunctions;
     * import com.pulumi.aws.lambda.inputs.GetCodeSigningConfigArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var existingCsc = LambdaFunctions.getCodeSigningConfig(GetCodeSigningConfigArgs.builder()
     *             .arn(String.format(&#34;arn:aws:lambda:%s:%s:code-signing-config:csc-0f6c334abcdea4d8b&#34;, var_.aws_region(),var_.aws_account()))
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetCodeSigningConfigResult> getCodeSigningConfigPlain(GetCodeSigningConfigPlainArgs args) {
        return getCodeSigningConfigPlain(args, InvokeOptions.Empty);
    }
    /**
     * Provides information about a Lambda Code Signing Config. A code signing configuration defines a list of allowed signing profiles and defines the code-signing validation policy (action to be taken if deployment validation checks fail).
     * 
     * For information about Lambda code signing configurations and how to use them, see [configuring code signing for Lambda functions](https://docs.aws.amazon.com/lambda/latest/dg/configuration-codesigning.html)
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.lambda.LambdaFunctions;
     * import com.pulumi.aws.lambda.inputs.GetCodeSigningConfigArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var existingCsc = LambdaFunctions.getCodeSigningConfig(GetCodeSigningConfigArgs.builder()
     *             .arn(String.format(&#34;arn:aws:lambda:%s:%s:code-signing-config:csc-0f6c334abcdea4d8b&#34;, var_.aws_region(),var_.aws_account()))
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetCodeSigningConfigResult> getCodeSigningConfig(GetCodeSigningConfigArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:lambda/getCodeSigningConfig:getCodeSigningConfig", TypeShape.of(GetCodeSigningConfigResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides information about a Lambda Code Signing Config. A code signing configuration defines a list of allowed signing profiles and defines the code-signing validation policy (action to be taken if deployment validation checks fail).
     * 
     * For information about Lambda code signing configurations and how to use them, see [configuring code signing for Lambda functions](https://docs.aws.amazon.com/lambda/latest/dg/configuration-codesigning.html)
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.lambda.LambdaFunctions;
     * import com.pulumi.aws.lambda.inputs.GetCodeSigningConfigArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var existingCsc = LambdaFunctions.getCodeSigningConfig(GetCodeSigningConfigArgs.builder()
     *             .arn(String.format(&#34;arn:aws:lambda:%s:%s:code-signing-config:csc-0f6c334abcdea4d8b&#34;, var_.aws_region(),var_.aws_account()))
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetCodeSigningConfigResult> getCodeSigningConfigPlain(GetCodeSigningConfigPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:lambda/getCodeSigningConfig:getCodeSigningConfig", TypeShape.of(GetCodeSigningConfigResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides information about a Lambda Function.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.lambda.LambdaFunctions;
     * import com.pulumi.aws.lambda.inputs.GetFunctionArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var config = ctx.config();
     *         final var functionName = config.get(&#34;functionName&#34;);
     *         final var existing = LambdaFunctions.getFunction(GetFunctionArgs.builder()
     *             .functionName(functionName)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetFunctionResult> getFunction(GetFunctionArgs args) {
        return getFunction(args, InvokeOptions.Empty);
    }
    /**
     * Provides information about a Lambda Function.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.lambda.LambdaFunctions;
     * import com.pulumi.aws.lambda.inputs.GetFunctionArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var config = ctx.config();
     *         final var functionName = config.get(&#34;functionName&#34;);
     *         final var existing = LambdaFunctions.getFunction(GetFunctionArgs.builder()
     *             .functionName(functionName)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetFunctionResult> getFunctionPlain(GetFunctionPlainArgs args) {
        return getFunctionPlain(args, InvokeOptions.Empty);
    }
    /**
     * Provides information about a Lambda Function.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.lambda.LambdaFunctions;
     * import com.pulumi.aws.lambda.inputs.GetFunctionArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var config = ctx.config();
     *         final var functionName = config.get(&#34;functionName&#34;);
     *         final var existing = LambdaFunctions.getFunction(GetFunctionArgs.builder()
     *             .functionName(functionName)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetFunctionResult> getFunction(GetFunctionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:lambda/getFunction:getFunction", TypeShape.of(GetFunctionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides information about a Lambda Function.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.lambda.LambdaFunctions;
     * import com.pulumi.aws.lambda.inputs.GetFunctionArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var config = ctx.config();
     *         final var functionName = config.get(&#34;functionName&#34;);
     *         final var existing = LambdaFunctions.getFunction(GetFunctionArgs.builder()
     *             .functionName(functionName)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetFunctionResult> getFunctionPlain(GetFunctionPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:lambda/getFunction:getFunction", TypeShape.of(GetFunctionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides information about a Lambda function URL.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.lambda.LambdaFunctions;
     * import com.pulumi.aws.lambda.inputs.GetFunctionUrlArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var config = ctx.config();
     *         final var functionName = config.get(&#34;functionName&#34;);
     *         final var existing = LambdaFunctions.getFunctionUrl(GetFunctionUrlArgs.builder()
     *             .functionName(functionName)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetFunctionUrlResult> getFunctionUrl(GetFunctionUrlArgs args) {
        return getFunctionUrl(args, InvokeOptions.Empty);
    }
    /**
     * Provides information about a Lambda function URL.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.lambda.LambdaFunctions;
     * import com.pulumi.aws.lambda.inputs.GetFunctionUrlArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var config = ctx.config();
     *         final var functionName = config.get(&#34;functionName&#34;);
     *         final var existing = LambdaFunctions.getFunctionUrl(GetFunctionUrlArgs.builder()
     *             .functionName(functionName)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetFunctionUrlResult> getFunctionUrlPlain(GetFunctionUrlPlainArgs args) {
        return getFunctionUrlPlain(args, InvokeOptions.Empty);
    }
    /**
     * Provides information about a Lambda function URL.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.lambda.LambdaFunctions;
     * import com.pulumi.aws.lambda.inputs.GetFunctionUrlArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var config = ctx.config();
     *         final var functionName = config.get(&#34;functionName&#34;);
     *         final var existing = LambdaFunctions.getFunctionUrl(GetFunctionUrlArgs.builder()
     *             .functionName(functionName)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetFunctionUrlResult> getFunctionUrl(GetFunctionUrlArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:lambda/getFunctionUrl:getFunctionUrl", TypeShape.of(GetFunctionUrlResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides information about a Lambda function URL.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.lambda.LambdaFunctions;
     * import com.pulumi.aws.lambda.inputs.GetFunctionUrlArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var config = ctx.config();
     *         final var functionName = config.get(&#34;functionName&#34;);
     *         final var existing = LambdaFunctions.getFunctionUrl(GetFunctionUrlArgs.builder()
     *             .functionName(functionName)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetFunctionUrlResult> getFunctionUrlPlain(GetFunctionUrlPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:lambda/getFunctionUrl:getFunctionUrl", TypeShape.of(GetFunctionUrlResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to invoke custom lambda functions as data source.
     * The lambda function is invoked with [RequestResponse](https://docs.aws.amazon.com/lambda/latest/dg/API_Invoke.html#API_Invoke_RequestSyntax)
     * invocation type.
     * 
     */
    public static Output<GetInvocationResult> getInvocation(GetInvocationArgs args) {
        return getInvocation(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to invoke custom lambda functions as data source.
     * The lambda function is invoked with [RequestResponse](https://docs.aws.amazon.com/lambda/latest/dg/API_Invoke.html#API_Invoke_RequestSyntax)
     * invocation type.
     * 
     */
    public static CompletableFuture<GetInvocationResult> getInvocationPlain(GetInvocationPlainArgs args) {
        return getInvocationPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to invoke custom lambda functions as data source.
     * The lambda function is invoked with [RequestResponse](https://docs.aws.amazon.com/lambda/latest/dg/API_Invoke.html#API_Invoke_RequestSyntax)
     * invocation type.
     * 
     */
    public static Output<GetInvocationResult> getInvocation(GetInvocationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:lambda/getInvocation:getInvocation", TypeShape.of(GetInvocationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to invoke custom lambda functions as data source.
     * The lambda function is invoked with [RequestResponse](https://docs.aws.amazon.com/lambda/latest/dg/API_Invoke.html#API_Invoke_RequestSyntax)
     * invocation type.
     * 
     */
    public static CompletableFuture<GetInvocationResult> getInvocationPlain(GetInvocationPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:lambda/getInvocation:getInvocation", TypeShape.of(GetInvocationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides information about a Lambda Layer Version.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.lambda.LambdaFunctions;
     * import com.pulumi.aws.lambda.inputs.GetLayerVersionArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var config = ctx.config();
     *         final var layerName = config.get(&#34;layerName&#34;);
     *         final var existing = LambdaFunctions.getLayerVersion(GetLayerVersionArgs.builder()
     *             .layerName(layerName)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetLayerVersionResult> getLayerVersion(GetLayerVersionArgs args) {
        return getLayerVersion(args, InvokeOptions.Empty);
    }
    /**
     * Provides information about a Lambda Layer Version.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.lambda.LambdaFunctions;
     * import com.pulumi.aws.lambda.inputs.GetLayerVersionArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var config = ctx.config();
     *         final var layerName = config.get(&#34;layerName&#34;);
     *         final var existing = LambdaFunctions.getLayerVersion(GetLayerVersionArgs.builder()
     *             .layerName(layerName)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetLayerVersionResult> getLayerVersionPlain(GetLayerVersionPlainArgs args) {
        return getLayerVersionPlain(args, InvokeOptions.Empty);
    }
    /**
     * Provides information about a Lambda Layer Version.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.lambda.LambdaFunctions;
     * import com.pulumi.aws.lambda.inputs.GetLayerVersionArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var config = ctx.config();
     *         final var layerName = config.get(&#34;layerName&#34;);
     *         final var existing = LambdaFunctions.getLayerVersion(GetLayerVersionArgs.builder()
     *             .layerName(layerName)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetLayerVersionResult> getLayerVersion(GetLayerVersionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:lambda/getLayerVersion:getLayerVersion", TypeShape.of(GetLayerVersionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides information about a Lambda Layer Version.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.lambda.LambdaFunctions;
     * import com.pulumi.aws.lambda.inputs.GetLayerVersionArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var config = ctx.config();
     *         final var layerName = config.get(&#34;layerName&#34;);
     *         final var existing = LambdaFunctions.getLayerVersion(GetLayerVersionArgs.builder()
     *             .layerName(layerName)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetLayerVersionResult> getLayerVersionPlain(GetLayerVersionPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:lambda/getLayerVersion:getLayerVersion", TypeShape.of(GetLayerVersionResult.class), args, Utilities.withVersion(options));
    }
}
