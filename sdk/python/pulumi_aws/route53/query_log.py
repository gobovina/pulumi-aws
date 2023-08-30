# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['QueryLogArgs', 'QueryLog']

@pulumi.input_type
class QueryLogArgs:
    def __init__(__self__, *,
                 cloudwatch_log_group_arn: pulumi.Input[str],
                 zone_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a QueryLog resource.
        :param pulumi.Input[str] cloudwatch_log_group_arn: CloudWatch log group ARN to send query logs.
        :param pulumi.Input[str] zone_id: Route53 hosted zone ID to enable query logs.
        """
        pulumi.set(__self__, "cloudwatch_log_group_arn", cloudwatch_log_group_arn)
        pulumi.set(__self__, "zone_id", zone_id)

    @property
    @pulumi.getter(name="cloudwatchLogGroupArn")
    def cloudwatch_log_group_arn(self) -> pulumi.Input[str]:
        """
        CloudWatch log group ARN to send query logs.
        """
        return pulumi.get(self, "cloudwatch_log_group_arn")

    @cloudwatch_log_group_arn.setter
    def cloudwatch_log_group_arn(self, value: pulumi.Input[str]):
        pulumi.set(self, "cloudwatch_log_group_arn", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Input[str]:
        """
        Route53 hosted zone ID to enable query logs.
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "zone_id", value)


@pulumi.input_type
class _QueryLogState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 cloudwatch_log_group_arn: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering QueryLog resources.
        :param pulumi.Input[str] arn: The Amazon Resource Name (ARN) of the Query Logging Config.
        :param pulumi.Input[str] cloudwatch_log_group_arn: CloudWatch log group ARN to send query logs.
        :param pulumi.Input[str] zone_id: Route53 hosted zone ID to enable query logs.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if cloudwatch_log_group_arn is not None:
            pulumi.set(__self__, "cloudwatch_log_group_arn", cloudwatch_log_group_arn)
        if zone_id is not None:
            pulumi.set(__self__, "zone_id", zone_id)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        The Amazon Resource Name (ARN) of the Query Logging Config.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="cloudwatchLogGroupArn")
    def cloudwatch_log_group_arn(self) -> Optional[pulumi.Input[str]]:
        """
        CloudWatch log group ARN to send query logs.
        """
        return pulumi.get(self, "cloudwatch_log_group_arn")

    @cloudwatch_log_group_arn.setter
    def cloudwatch_log_group_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cloudwatch_log_group_arn", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> Optional[pulumi.Input[str]]:
        """
        Route53 hosted zone ID to enable query logs.
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "zone_id", value)


class QueryLog(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cloudwatch_log_group_arn: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Route53 query logging configuration resource.

        > **NOTE:** There are restrictions on the configuration of query logging. Notably,
        the CloudWatch log group must be in the `us-east-1` region,
        a permissive CloudWatch log resource policy must be in place, and
        the Route53 hosted zone must be public.
        See [Configuring Logging for DNS Queries](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/query-logs.html?console_help=true#query-logs-configuring) for additional details.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        # Example CloudWatch log group in us-east-1
        us_east_1 = aws.Provider("us-east-1", region="us-east-1")
        aws_route53_example_com = aws.cloudwatch.LogGroup("awsRoute53ExampleCom", retention_in_days=30,
        opts=pulumi.ResourceOptions(provider=aws["us-east-1"]))
        # Example CloudWatch log resource policy to allow Route53 to write logs
        # to any log group under /aws/route53/*
        route53_query_logging_policy_policy_document = aws.iam.get_policy_document(statements=[aws.iam.GetPolicyDocumentStatementArgs(
            actions=[
                "logs:CreateLogStream",
                "logs:PutLogEvents",
            ],
            resources=["arn:aws:logs:*:*:log-group:/aws/route53/*"],
            principals=[aws.iam.GetPolicyDocumentStatementPrincipalArgs(
                identifiers=["route53.amazonaws.com"],
                type="Service",
            )],
        )])
        route53_query_logging_policy_log_resource_policy = aws.cloudwatch.LogResourcePolicy("route53-query-logging-policyLogResourcePolicy",
            policy_document=route53_query_logging_policy_policy_document.json,
            policy_name="route53-query-logging-policy",
            opts=pulumi.ResourceOptions(provider=aws["us-east-1"]))
        # Example Route53 zone with query logging
        example_com_zone = aws.route53.Zone("exampleComZone")
        example_com_query_log = aws.route53.QueryLog("exampleComQueryLog",
            cloudwatch_log_group_arn=aws_route53_example_com.arn,
            zone_id=example_com_zone.zone_id,
            opts=pulumi.ResourceOptions(depends_on=[route53_query_logging_policy_log_resource_policy]))
        ```

        ## Import

        Using `pulumi import`, import Route53 query logging configurations using their ID. For example:

        ```sh
         $ pulumi import aws:route53/queryLog:QueryLog example_com xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cloudwatch_log_group_arn: CloudWatch log group ARN to send query logs.
        :param pulumi.Input[str] zone_id: Route53 hosted zone ID to enable query logs.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: QueryLogArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Route53 query logging configuration resource.

        > **NOTE:** There are restrictions on the configuration of query logging. Notably,
        the CloudWatch log group must be in the `us-east-1` region,
        a permissive CloudWatch log resource policy must be in place, and
        the Route53 hosted zone must be public.
        See [Configuring Logging for DNS Queries](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/query-logs.html?console_help=true#query-logs-configuring) for additional details.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        # Example CloudWatch log group in us-east-1
        us_east_1 = aws.Provider("us-east-1", region="us-east-1")
        aws_route53_example_com = aws.cloudwatch.LogGroup("awsRoute53ExampleCom", retention_in_days=30,
        opts=pulumi.ResourceOptions(provider=aws["us-east-1"]))
        # Example CloudWatch log resource policy to allow Route53 to write logs
        # to any log group under /aws/route53/*
        route53_query_logging_policy_policy_document = aws.iam.get_policy_document(statements=[aws.iam.GetPolicyDocumentStatementArgs(
            actions=[
                "logs:CreateLogStream",
                "logs:PutLogEvents",
            ],
            resources=["arn:aws:logs:*:*:log-group:/aws/route53/*"],
            principals=[aws.iam.GetPolicyDocumentStatementPrincipalArgs(
                identifiers=["route53.amazonaws.com"],
                type="Service",
            )],
        )])
        route53_query_logging_policy_log_resource_policy = aws.cloudwatch.LogResourcePolicy("route53-query-logging-policyLogResourcePolicy",
            policy_document=route53_query_logging_policy_policy_document.json,
            policy_name="route53-query-logging-policy",
            opts=pulumi.ResourceOptions(provider=aws["us-east-1"]))
        # Example Route53 zone with query logging
        example_com_zone = aws.route53.Zone("exampleComZone")
        example_com_query_log = aws.route53.QueryLog("exampleComQueryLog",
            cloudwatch_log_group_arn=aws_route53_example_com.arn,
            zone_id=example_com_zone.zone_id,
            opts=pulumi.ResourceOptions(depends_on=[route53_query_logging_policy_log_resource_policy]))
        ```

        ## Import

        Using `pulumi import`, import Route53 query logging configurations using their ID. For example:

        ```sh
         $ pulumi import aws:route53/queryLog:QueryLog example_com xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx
        ```

        :param str resource_name: The name of the resource.
        :param QueryLogArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(QueryLogArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cloudwatch_log_group_arn: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = QueryLogArgs.__new__(QueryLogArgs)

            if cloudwatch_log_group_arn is None and not opts.urn:
                raise TypeError("Missing required property 'cloudwatch_log_group_arn'")
            __props__.__dict__["cloudwatch_log_group_arn"] = cloudwatch_log_group_arn
            if zone_id is None and not opts.urn:
                raise TypeError("Missing required property 'zone_id'")
            __props__.__dict__["zone_id"] = zone_id
            __props__.__dict__["arn"] = None
        super(QueryLog, __self__).__init__(
            'aws:route53/queryLog:QueryLog',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            cloudwatch_log_group_arn: Optional[pulumi.Input[str]] = None,
            zone_id: Optional[pulumi.Input[str]] = None) -> 'QueryLog':
        """
        Get an existing QueryLog resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: The Amazon Resource Name (ARN) of the Query Logging Config.
        :param pulumi.Input[str] cloudwatch_log_group_arn: CloudWatch log group ARN to send query logs.
        :param pulumi.Input[str] zone_id: Route53 hosted zone ID to enable query logs.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _QueryLogState.__new__(_QueryLogState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["cloudwatch_log_group_arn"] = cloudwatch_log_group_arn
        __props__.__dict__["zone_id"] = zone_id
        return QueryLog(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        The Amazon Resource Name (ARN) of the Query Logging Config.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="cloudwatchLogGroupArn")
    def cloudwatch_log_group_arn(self) -> pulumi.Output[str]:
        """
        CloudWatch log group ARN to send query logs.
        """
        return pulumi.get(self, "cloudwatch_log_group_arn")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Output[str]:
        """
        Route53 hosted zone ID to enable query logs.
        """
        return pulumi.get(self, "zone_id")

