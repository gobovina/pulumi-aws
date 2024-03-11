# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['FunctionEventInvokeConfigArgs', 'FunctionEventInvokeConfig']

@pulumi.input_type
class FunctionEventInvokeConfigArgs:
    def __init__(__self__, *,
                 function_name: pulumi.Input[str],
                 destination_config: Optional[pulumi.Input['FunctionEventInvokeConfigDestinationConfigArgs']] = None,
                 maximum_event_age_in_seconds: Optional[pulumi.Input[int]] = None,
                 maximum_retry_attempts: Optional[pulumi.Input[int]] = None,
                 qualifier: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a FunctionEventInvokeConfig resource.
        :param pulumi.Input[str] function_name: Name or Amazon Resource Name (ARN) of the Lambda Function, omitting any version or alias qualifier.
               
               The following arguments are optional:
        :param pulumi.Input['FunctionEventInvokeConfigDestinationConfigArgs'] destination_config: Configuration block with destination configuration. See below for details.
        :param pulumi.Input[int] maximum_event_age_in_seconds: Maximum age of a request that Lambda sends to a function for processing in seconds. Valid values between 60 and 21600.
        :param pulumi.Input[int] maximum_retry_attempts: Maximum number of times to retry when the function returns an error. Valid values between 0 and 2. Defaults to 2.
        :param pulumi.Input[str] qualifier: Lambda Function published version, `$LATEST`, or Lambda Alias name.
        """
        pulumi.set(__self__, "function_name", function_name)
        if destination_config is not None:
            pulumi.set(__self__, "destination_config", destination_config)
        if maximum_event_age_in_seconds is not None:
            pulumi.set(__self__, "maximum_event_age_in_seconds", maximum_event_age_in_seconds)
        if maximum_retry_attempts is not None:
            pulumi.set(__self__, "maximum_retry_attempts", maximum_retry_attempts)
        if qualifier is not None:
            pulumi.set(__self__, "qualifier", qualifier)

    @property
    @pulumi.getter(name="functionName")
    def function_name(self) -> pulumi.Input[str]:
        """
        Name or Amazon Resource Name (ARN) of the Lambda Function, omitting any version or alias qualifier.

        The following arguments are optional:
        """
        return pulumi.get(self, "function_name")

    @function_name.setter
    def function_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "function_name", value)

    @property
    @pulumi.getter(name="destinationConfig")
    def destination_config(self) -> Optional[pulumi.Input['FunctionEventInvokeConfigDestinationConfigArgs']]:
        """
        Configuration block with destination configuration. See below for details.
        """
        return pulumi.get(self, "destination_config")

    @destination_config.setter
    def destination_config(self, value: Optional[pulumi.Input['FunctionEventInvokeConfigDestinationConfigArgs']]):
        pulumi.set(self, "destination_config", value)

    @property
    @pulumi.getter(name="maximumEventAgeInSeconds")
    def maximum_event_age_in_seconds(self) -> Optional[pulumi.Input[int]]:
        """
        Maximum age of a request that Lambda sends to a function for processing in seconds. Valid values between 60 and 21600.
        """
        return pulumi.get(self, "maximum_event_age_in_seconds")

    @maximum_event_age_in_seconds.setter
    def maximum_event_age_in_seconds(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "maximum_event_age_in_seconds", value)

    @property
    @pulumi.getter(name="maximumRetryAttempts")
    def maximum_retry_attempts(self) -> Optional[pulumi.Input[int]]:
        """
        Maximum number of times to retry when the function returns an error. Valid values between 0 and 2. Defaults to 2.
        """
        return pulumi.get(self, "maximum_retry_attempts")

    @maximum_retry_attempts.setter
    def maximum_retry_attempts(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "maximum_retry_attempts", value)

    @property
    @pulumi.getter
    def qualifier(self) -> Optional[pulumi.Input[str]]:
        """
        Lambda Function published version, `$LATEST`, or Lambda Alias name.
        """
        return pulumi.get(self, "qualifier")

    @qualifier.setter
    def qualifier(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "qualifier", value)


@pulumi.input_type
class _FunctionEventInvokeConfigState:
    def __init__(__self__, *,
                 destination_config: Optional[pulumi.Input['FunctionEventInvokeConfigDestinationConfigArgs']] = None,
                 function_name: Optional[pulumi.Input[str]] = None,
                 maximum_event_age_in_seconds: Optional[pulumi.Input[int]] = None,
                 maximum_retry_attempts: Optional[pulumi.Input[int]] = None,
                 qualifier: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering FunctionEventInvokeConfig resources.
        :param pulumi.Input['FunctionEventInvokeConfigDestinationConfigArgs'] destination_config: Configuration block with destination configuration. See below for details.
        :param pulumi.Input[str] function_name: Name or Amazon Resource Name (ARN) of the Lambda Function, omitting any version or alias qualifier.
               
               The following arguments are optional:
        :param pulumi.Input[int] maximum_event_age_in_seconds: Maximum age of a request that Lambda sends to a function for processing in seconds. Valid values between 60 and 21600.
        :param pulumi.Input[int] maximum_retry_attempts: Maximum number of times to retry when the function returns an error. Valid values between 0 and 2. Defaults to 2.
        :param pulumi.Input[str] qualifier: Lambda Function published version, `$LATEST`, or Lambda Alias name.
        """
        if destination_config is not None:
            pulumi.set(__self__, "destination_config", destination_config)
        if function_name is not None:
            pulumi.set(__self__, "function_name", function_name)
        if maximum_event_age_in_seconds is not None:
            pulumi.set(__self__, "maximum_event_age_in_seconds", maximum_event_age_in_seconds)
        if maximum_retry_attempts is not None:
            pulumi.set(__self__, "maximum_retry_attempts", maximum_retry_attempts)
        if qualifier is not None:
            pulumi.set(__self__, "qualifier", qualifier)

    @property
    @pulumi.getter(name="destinationConfig")
    def destination_config(self) -> Optional[pulumi.Input['FunctionEventInvokeConfigDestinationConfigArgs']]:
        """
        Configuration block with destination configuration. See below for details.
        """
        return pulumi.get(self, "destination_config")

    @destination_config.setter
    def destination_config(self, value: Optional[pulumi.Input['FunctionEventInvokeConfigDestinationConfigArgs']]):
        pulumi.set(self, "destination_config", value)

    @property
    @pulumi.getter(name="functionName")
    def function_name(self) -> Optional[pulumi.Input[str]]:
        """
        Name or Amazon Resource Name (ARN) of the Lambda Function, omitting any version or alias qualifier.

        The following arguments are optional:
        """
        return pulumi.get(self, "function_name")

    @function_name.setter
    def function_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "function_name", value)

    @property
    @pulumi.getter(name="maximumEventAgeInSeconds")
    def maximum_event_age_in_seconds(self) -> Optional[pulumi.Input[int]]:
        """
        Maximum age of a request that Lambda sends to a function for processing in seconds. Valid values between 60 and 21600.
        """
        return pulumi.get(self, "maximum_event_age_in_seconds")

    @maximum_event_age_in_seconds.setter
    def maximum_event_age_in_seconds(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "maximum_event_age_in_seconds", value)

    @property
    @pulumi.getter(name="maximumRetryAttempts")
    def maximum_retry_attempts(self) -> Optional[pulumi.Input[int]]:
        """
        Maximum number of times to retry when the function returns an error. Valid values between 0 and 2. Defaults to 2.
        """
        return pulumi.get(self, "maximum_retry_attempts")

    @maximum_retry_attempts.setter
    def maximum_retry_attempts(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "maximum_retry_attempts", value)

    @property
    @pulumi.getter
    def qualifier(self) -> Optional[pulumi.Input[str]]:
        """
        Lambda Function published version, `$LATEST`, or Lambda Alias name.
        """
        return pulumi.get(self, "qualifier")

    @qualifier.setter
    def qualifier(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "qualifier", value)


class FunctionEventInvokeConfig(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 destination_config: Optional[pulumi.Input[pulumi.InputType['FunctionEventInvokeConfigDestinationConfigArgs']]] = None,
                 function_name: Optional[pulumi.Input[str]] = None,
                 maximum_event_age_in_seconds: Optional[pulumi.Input[int]] = None,
                 maximum_retry_attempts: Optional[pulumi.Input[int]] = None,
                 qualifier: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages an asynchronous invocation configuration for a Lambda Function or Alias. More information about asynchronous invocations and the configurable values can be found in the [Lambda Developer Guide](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html).

        ## Example Usage

        ### Destination Configuration

        > **NOTE:** Ensure the Lambda Function IAM Role has necessary permissions for the destination, such as `sqs:SendMessage` or `sns:Publish`, otherwise the API will return a generic `InvalidParameterValueException: The destination ARN arn:PARTITION:SERVICE:REGION:ACCOUNT:RESOURCE is invalid.` error.

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.lambda_.FunctionEventInvokeConfig("example",
            function_name=example_aws_lambda_alias["functionName"],
            destination_config=aws.lambda_.FunctionEventInvokeConfigDestinationConfigArgs(
                on_failure=aws.lambda_.FunctionEventInvokeConfigDestinationConfigOnFailureArgs(
                    destination=example_aws_sqs_queue["arn"],
                ),
                on_success=aws.lambda_.FunctionEventInvokeConfigDestinationConfigOnSuccessArgs(
                    destination=example_aws_sns_topic["arn"],
                ),
            ))
        ```
        <!--End PulumiCodeChooser -->

        ### Error Handling Configuration

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.lambda_.FunctionEventInvokeConfig("example",
            function_name=example_aws_lambda_alias["functionName"],
            maximum_event_age_in_seconds=60,
            maximum_retry_attempts=0)
        ```
        <!--End PulumiCodeChooser -->

        ### Configuration for Alias Name

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.lambda_.FunctionEventInvokeConfig("example",
            function_name=example_aws_lambda_alias["functionName"],
            qualifier=example_aws_lambda_alias["name"])
        ```
        <!--End PulumiCodeChooser -->

        ### Configuration for Function Latest Unpublished Version

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.lambda_.FunctionEventInvokeConfig("example",
            function_name=example_aws_lambda_function["functionName"],
            qualifier="$LATEST")
        ```
        <!--End PulumiCodeChooser -->

        ### Configuration for Function Published Version

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.lambda_.FunctionEventInvokeConfig("example",
            function_name=example_aws_lambda_function["functionName"],
            qualifier=example_aws_lambda_function["version"])
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        ARN with qualifier:

        Name without qualifier (all versions and aliases):

        Name with qualifier:

        __Using `pulumi import` to import__ Lambda Function Event Invoke Configs using the fully qualified Function name or Amazon Resource Name (ARN). For example:

        ARN without qualifier (all versions and aliases):

        ```sh
        $ pulumi import aws:lambda/functionEventInvokeConfig:FunctionEventInvokeConfig example arn:aws:us-east-1:123456789012:function:my_function
        ```
        ARN with qualifier:

        ```sh
        $ pulumi import aws:lambda/functionEventInvokeConfig:FunctionEventInvokeConfig example arn:aws:us-east-1:123456789012:function:my_function:production
        ```
        Name without qualifier (all versions and aliases):

        ```sh
        $ pulumi import aws:lambda/functionEventInvokeConfig:FunctionEventInvokeConfig example my_function
        ```
        Name with qualifier:

        ```sh
        $ pulumi import aws:lambda/functionEventInvokeConfig:FunctionEventInvokeConfig example my_function:production
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['FunctionEventInvokeConfigDestinationConfigArgs']] destination_config: Configuration block with destination configuration. See below for details.
        :param pulumi.Input[str] function_name: Name or Amazon Resource Name (ARN) of the Lambda Function, omitting any version or alias qualifier.
               
               The following arguments are optional:
        :param pulumi.Input[int] maximum_event_age_in_seconds: Maximum age of a request that Lambda sends to a function for processing in seconds. Valid values between 60 and 21600.
        :param pulumi.Input[int] maximum_retry_attempts: Maximum number of times to retry when the function returns an error. Valid values between 0 and 2. Defaults to 2.
        :param pulumi.Input[str] qualifier: Lambda Function published version, `$LATEST`, or Lambda Alias name.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: FunctionEventInvokeConfigArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages an asynchronous invocation configuration for a Lambda Function or Alias. More information about asynchronous invocations and the configurable values can be found in the [Lambda Developer Guide](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html).

        ## Example Usage

        ### Destination Configuration

        > **NOTE:** Ensure the Lambda Function IAM Role has necessary permissions for the destination, such as `sqs:SendMessage` or `sns:Publish`, otherwise the API will return a generic `InvalidParameterValueException: The destination ARN arn:PARTITION:SERVICE:REGION:ACCOUNT:RESOURCE is invalid.` error.

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.lambda_.FunctionEventInvokeConfig("example",
            function_name=example_aws_lambda_alias["functionName"],
            destination_config=aws.lambda_.FunctionEventInvokeConfigDestinationConfigArgs(
                on_failure=aws.lambda_.FunctionEventInvokeConfigDestinationConfigOnFailureArgs(
                    destination=example_aws_sqs_queue["arn"],
                ),
                on_success=aws.lambda_.FunctionEventInvokeConfigDestinationConfigOnSuccessArgs(
                    destination=example_aws_sns_topic["arn"],
                ),
            ))
        ```
        <!--End PulumiCodeChooser -->

        ### Error Handling Configuration

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.lambda_.FunctionEventInvokeConfig("example",
            function_name=example_aws_lambda_alias["functionName"],
            maximum_event_age_in_seconds=60,
            maximum_retry_attempts=0)
        ```
        <!--End PulumiCodeChooser -->

        ### Configuration for Alias Name

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.lambda_.FunctionEventInvokeConfig("example",
            function_name=example_aws_lambda_alias["functionName"],
            qualifier=example_aws_lambda_alias["name"])
        ```
        <!--End PulumiCodeChooser -->

        ### Configuration for Function Latest Unpublished Version

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.lambda_.FunctionEventInvokeConfig("example",
            function_name=example_aws_lambda_function["functionName"],
            qualifier="$LATEST")
        ```
        <!--End PulumiCodeChooser -->

        ### Configuration for Function Published Version

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.lambda_.FunctionEventInvokeConfig("example",
            function_name=example_aws_lambda_function["functionName"],
            qualifier=example_aws_lambda_function["version"])
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        ARN with qualifier:

        Name without qualifier (all versions and aliases):

        Name with qualifier:

        __Using `pulumi import` to import__ Lambda Function Event Invoke Configs using the fully qualified Function name or Amazon Resource Name (ARN). For example:

        ARN without qualifier (all versions and aliases):

        ```sh
        $ pulumi import aws:lambda/functionEventInvokeConfig:FunctionEventInvokeConfig example arn:aws:us-east-1:123456789012:function:my_function
        ```
        ARN with qualifier:

        ```sh
        $ pulumi import aws:lambda/functionEventInvokeConfig:FunctionEventInvokeConfig example arn:aws:us-east-1:123456789012:function:my_function:production
        ```
        Name without qualifier (all versions and aliases):

        ```sh
        $ pulumi import aws:lambda/functionEventInvokeConfig:FunctionEventInvokeConfig example my_function
        ```
        Name with qualifier:

        ```sh
        $ pulumi import aws:lambda/functionEventInvokeConfig:FunctionEventInvokeConfig example my_function:production
        ```

        :param str resource_name: The name of the resource.
        :param FunctionEventInvokeConfigArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(FunctionEventInvokeConfigArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 destination_config: Optional[pulumi.Input[pulumi.InputType['FunctionEventInvokeConfigDestinationConfigArgs']]] = None,
                 function_name: Optional[pulumi.Input[str]] = None,
                 maximum_event_age_in_seconds: Optional[pulumi.Input[int]] = None,
                 maximum_retry_attempts: Optional[pulumi.Input[int]] = None,
                 qualifier: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = FunctionEventInvokeConfigArgs.__new__(FunctionEventInvokeConfigArgs)

            __props__.__dict__["destination_config"] = destination_config
            if function_name is None and not opts.urn:
                raise TypeError("Missing required property 'function_name'")
            __props__.__dict__["function_name"] = function_name
            __props__.__dict__["maximum_event_age_in_seconds"] = maximum_event_age_in_seconds
            __props__.__dict__["maximum_retry_attempts"] = maximum_retry_attempts
            __props__.__dict__["qualifier"] = qualifier
        super(FunctionEventInvokeConfig, __self__).__init__(
            'aws:lambda/functionEventInvokeConfig:FunctionEventInvokeConfig',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            destination_config: Optional[pulumi.Input[pulumi.InputType['FunctionEventInvokeConfigDestinationConfigArgs']]] = None,
            function_name: Optional[pulumi.Input[str]] = None,
            maximum_event_age_in_seconds: Optional[pulumi.Input[int]] = None,
            maximum_retry_attempts: Optional[pulumi.Input[int]] = None,
            qualifier: Optional[pulumi.Input[str]] = None) -> 'FunctionEventInvokeConfig':
        """
        Get an existing FunctionEventInvokeConfig resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['FunctionEventInvokeConfigDestinationConfigArgs']] destination_config: Configuration block with destination configuration. See below for details.
        :param pulumi.Input[str] function_name: Name or Amazon Resource Name (ARN) of the Lambda Function, omitting any version or alias qualifier.
               
               The following arguments are optional:
        :param pulumi.Input[int] maximum_event_age_in_seconds: Maximum age of a request that Lambda sends to a function for processing in seconds. Valid values between 60 and 21600.
        :param pulumi.Input[int] maximum_retry_attempts: Maximum number of times to retry when the function returns an error. Valid values between 0 and 2. Defaults to 2.
        :param pulumi.Input[str] qualifier: Lambda Function published version, `$LATEST`, or Lambda Alias name.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _FunctionEventInvokeConfigState.__new__(_FunctionEventInvokeConfigState)

        __props__.__dict__["destination_config"] = destination_config
        __props__.__dict__["function_name"] = function_name
        __props__.__dict__["maximum_event_age_in_seconds"] = maximum_event_age_in_seconds
        __props__.__dict__["maximum_retry_attempts"] = maximum_retry_attempts
        __props__.__dict__["qualifier"] = qualifier
        return FunctionEventInvokeConfig(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="destinationConfig")
    def destination_config(self) -> pulumi.Output[Optional['outputs.FunctionEventInvokeConfigDestinationConfig']]:
        """
        Configuration block with destination configuration. See below for details.
        """
        return pulumi.get(self, "destination_config")

    @property
    @pulumi.getter(name="functionName")
    def function_name(self) -> pulumi.Output[str]:
        """
        Name or Amazon Resource Name (ARN) of the Lambda Function, omitting any version or alias qualifier.

        The following arguments are optional:
        """
        return pulumi.get(self, "function_name")

    @property
    @pulumi.getter(name="maximumEventAgeInSeconds")
    def maximum_event_age_in_seconds(self) -> pulumi.Output[Optional[int]]:
        """
        Maximum age of a request that Lambda sends to a function for processing in seconds. Valid values between 60 and 21600.
        """
        return pulumi.get(self, "maximum_event_age_in_seconds")

    @property
    @pulumi.getter(name="maximumRetryAttempts")
    def maximum_retry_attempts(self) -> pulumi.Output[Optional[int]]:
        """
        Maximum number of times to retry when the function returns an error. Valid values between 0 and 2. Defaults to 2.
        """
        return pulumi.get(self, "maximum_retry_attempts")

    @property
    @pulumi.getter
    def qualifier(self) -> pulumi.Output[Optional[str]]:
        """
        Lambda Function published version, `$LATEST`, or Lambda Alias name.
        """
        return pulumi.get(self, "qualifier")

