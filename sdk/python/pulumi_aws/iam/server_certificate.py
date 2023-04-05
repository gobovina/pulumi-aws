# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['ServerCertificateArgs', 'ServerCertificate']

@pulumi.input_type
class ServerCertificateArgs:
    def __init__(__self__, *,
                 certificate_body: pulumi.Input[str],
                 private_key: pulumi.Input[str],
                 certificate_chain: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 name_prefix: Optional[pulumi.Input[str]] = None,
                 path: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a ServerCertificate resource.
        :param pulumi.Input[str] certificate_body: The contents of the public key certificate in
               PEM-encoded format.
        :param pulumi.Input[str] private_key: The contents of the private key in PEM-encoded format.
        :param pulumi.Input[str] certificate_chain: The contents of the certificate chain.
               This is typically a concatenation of the PEM-encoded public key certificates
               of the chain.
        :param pulumi.Input[str] name: The name of the Server Certificate. Do not include the
               path in this value. If omitted, this provider will assign a random, unique name.
        :param pulumi.Input[str] name_prefix: Creates a unique name beginning with the specified
               prefix. Conflicts with `name`.
        :param pulumi.Input[str] path: The IAM path for the server certificate.  If it is not
               included, it defaults to a slash (/). If this certificate is for use with
               AWS CloudFront, the path must be in format `/cloudfront/your_path_here`.
               See [IAM Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) for more details on IAM Paths.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Map of resource tags for the server certificate. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        pulumi.set(__self__, "certificate_body", certificate_body)
        pulumi.set(__self__, "private_key", private_key)
        if certificate_chain is not None:
            pulumi.set(__self__, "certificate_chain", certificate_chain)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if name_prefix is not None:
            pulumi.set(__self__, "name_prefix", name_prefix)
        if path is not None:
            pulumi.set(__self__, "path", path)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)

    @property
    @pulumi.getter(name="certificateBody")
    def certificate_body(self) -> pulumi.Input[str]:
        """
        The contents of the public key certificate in
        PEM-encoded format.
        """
        return pulumi.get(self, "certificate_body")

    @certificate_body.setter
    def certificate_body(self, value: pulumi.Input[str]):
        pulumi.set(self, "certificate_body", value)

    @property
    @pulumi.getter(name="privateKey")
    def private_key(self) -> pulumi.Input[str]:
        """
        The contents of the private key in PEM-encoded format.
        """
        return pulumi.get(self, "private_key")

    @private_key.setter
    def private_key(self, value: pulumi.Input[str]):
        pulumi.set(self, "private_key", value)

    @property
    @pulumi.getter(name="certificateChain")
    def certificate_chain(self) -> Optional[pulumi.Input[str]]:
        """
        The contents of the certificate chain.
        This is typically a concatenation of the PEM-encoded public key certificates
        of the chain.
        """
        return pulumi.get(self, "certificate_chain")

    @certificate_chain.setter
    def certificate_chain(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "certificate_chain", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Server Certificate. Do not include the
        path in this value. If omitted, this provider will assign a random, unique name.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="namePrefix")
    def name_prefix(self) -> Optional[pulumi.Input[str]]:
        """
        Creates a unique name beginning with the specified
        prefix. Conflicts with `name`.
        """
        return pulumi.get(self, "name_prefix")

    @name_prefix.setter
    def name_prefix(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name_prefix", value)

    @property
    @pulumi.getter
    def path(self) -> Optional[pulumi.Input[str]]:
        """
        The IAM path for the server certificate.  If it is not
        included, it defaults to a slash (/). If this certificate is for use with
        AWS CloudFront, the path must be in format `/cloudfront/your_path_here`.
        See [IAM Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) for more details on IAM Paths.
        """
        return pulumi.get(self, "path")

    @path.setter
    def path(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "path", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Map of resource tags for the server certificate. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)


@pulumi.input_type
class _ServerCertificateState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 certificate_body: Optional[pulumi.Input[str]] = None,
                 certificate_chain: Optional[pulumi.Input[str]] = None,
                 expiration: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 name_prefix: Optional[pulumi.Input[str]] = None,
                 path: Optional[pulumi.Input[str]] = None,
                 private_key: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 upload_date: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ServerCertificate resources.
        :param pulumi.Input[str] arn: The Amazon Resource Name (ARN) specifying the server certificate.
        :param pulumi.Input[str] certificate_body: The contents of the public key certificate in
               PEM-encoded format.
        :param pulumi.Input[str] certificate_chain: The contents of the certificate chain.
               This is typically a concatenation of the PEM-encoded public key certificates
               of the chain.
        :param pulumi.Input[str] expiration: Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) on which the certificate is set to expire.
        :param pulumi.Input[str] name: The name of the Server Certificate. Do not include the
               path in this value. If omitted, this provider will assign a random, unique name.
        :param pulumi.Input[str] name_prefix: Creates a unique name beginning with the specified
               prefix. Conflicts with `name`.
        :param pulumi.Input[str] path: The IAM path for the server certificate.  If it is not
               included, it defaults to a slash (/). If this certificate is for use with
               AWS CloudFront, the path must be in format `/cloudfront/your_path_here`.
               See [IAM Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) for more details on IAM Paths.
        :param pulumi.Input[str] private_key: The contents of the private key in PEM-encoded format.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Map of resource tags for the server certificate. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input[str] upload_date: Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) when the server certificate was uploaded.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if certificate_body is not None:
            pulumi.set(__self__, "certificate_body", certificate_body)
        if certificate_chain is not None:
            pulumi.set(__self__, "certificate_chain", certificate_chain)
        if expiration is not None:
            pulumi.set(__self__, "expiration", expiration)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if name_prefix is not None:
            pulumi.set(__self__, "name_prefix", name_prefix)
        if path is not None:
            pulumi.set(__self__, "path", path)
        if private_key is not None:
            pulumi.set(__self__, "private_key", private_key)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)
        if upload_date is not None:
            pulumi.set(__self__, "upload_date", upload_date)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        The Amazon Resource Name (ARN) specifying the server certificate.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="certificateBody")
    def certificate_body(self) -> Optional[pulumi.Input[str]]:
        """
        The contents of the public key certificate in
        PEM-encoded format.
        """
        return pulumi.get(self, "certificate_body")

    @certificate_body.setter
    def certificate_body(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "certificate_body", value)

    @property
    @pulumi.getter(name="certificateChain")
    def certificate_chain(self) -> Optional[pulumi.Input[str]]:
        """
        The contents of the certificate chain.
        This is typically a concatenation of the PEM-encoded public key certificates
        of the chain.
        """
        return pulumi.get(self, "certificate_chain")

    @certificate_chain.setter
    def certificate_chain(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "certificate_chain", value)

    @property
    @pulumi.getter
    def expiration(self) -> Optional[pulumi.Input[str]]:
        """
        Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) on which the certificate is set to expire.
        """
        return pulumi.get(self, "expiration")

    @expiration.setter
    def expiration(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "expiration", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Server Certificate. Do not include the
        path in this value. If omitted, this provider will assign a random, unique name.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="namePrefix")
    def name_prefix(self) -> Optional[pulumi.Input[str]]:
        """
        Creates a unique name beginning with the specified
        prefix. Conflicts with `name`.
        """
        return pulumi.get(self, "name_prefix")

    @name_prefix.setter
    def name_prefix(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name_prefix", value)

    @property
    @pulumi.getter
    def path(self) -> Optional[pulumi.Input[str]]:
        """
        The IAM path for the server certificate.  If it is not
        included, it defaults to a slash (/). If this certificate is for use with
        AWS CloudFront, the path must be in format `/cloudfront/your_path_here`.
        See [IAM Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) for more details on IAM Paths.
        """
        return pulumi.get(self, "path")

    @path.setter
    def path(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "path", value)

    @property
    @pulumi.getter(name="privateKey")
    def private_key(self) -> Optional[pulumi.Input[str]]:
        """
        The contents of the private key in PEM-encoded format.
        """
        return pulumi.get(self, "private_key")

    @private_key.setter
    def private_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "private_key", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Map of resource tags for the server certificate. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)

    @property
    @pulumi.getter(name="uploadDate")
    def upload_date(self) -> Optional[pulumi.Input[str]]:
        """
        Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) when the server certificate was uploaded.
        """
        return pulumi.get(self, "upload_date")

    @upload_date.setter
    def upload_date(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "upload_date", value)


class ServerCertificate(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 certificate_body: Optional[pulumi.Input[str]] = None,
                 certificate_chain: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 name_prefix: Optional[pulumi.Input[str]] = None,
                 path: Optional[pulumi.Input[str]] = None,
                 private_key: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Provides an IAM Server Certificate resource to upload Server Certificates.
        Certs uploaded to IAM can easily work with other AWS services such as:

        - AWS Elastic Beanstalk
        - Elastic Load Balancing
        - CloudFront
        - AWS OpsWorks

        For information about server certificates in IAM, see [Managing Server
        Certificates][2] in AWS Documentation.

        ## Example Usage

        **Using certs on file:**

        ```python
        import pulumi
        import pulumi_aws as aws

        test_cert = aws.iam.ServerCertificate("testCert",
            certificate_body=(lambda path: open(path).read())("self-ca-cert.pem"),
            private_key=(lambda path: open(path).read())("test-key.pem"))
        ```

        **Example with cert in-line:**

        ```python
        import pulumi
        import pulumi_aws as aws

        test_cert_alt = aws.iam.ServerCertificate("testCertAlt",
            certificate_body=\"\"\"-----BEGIN CERTIFICATE-----
        [......] # cert contents
        -----END CERTIFICATE-----

        \"\"\",
            private_key=\"\"\"-----BEGIN RSA PRIVATE KEY-----
        [......] # cert contents
        -----END RSA PRIVATE KEY-----

        \"\"\")
        ```

        **Use in combination with an AWS ELB resource:**

        Some properties of an IAM Server Certificates cannot be updated while they are
        in use. In order for the provider to effectively manage a Certificate in this situation, it is
        recommended you utilize the `name_prefix` attribute and enable the
        `create_before_destroy`. This will allow this provider
        to create a new, updated `iam.ServerCertificate` resource and replace it in
        dependant resources before attempting to destroy the old version.

        ```python
        import pulumi
        import pulumi_aws as aws

        test_cert = aws.iam.ServerCertificate("testCert",
            name_prefix="example-cert",
            certificate_body=(lambda path: open(path).read())("self-ca-cert.pem"),
            private_key=(lambda path: open(path).read())("test-key.pem"))
        ourapp = aws.elb.LoadBalancer("ourapp",
            availability_zones=["us-west-2a"],
            cross_zone_load_balancing=True,
            listeners=[aws.elb.LoadBalancerListenerArgs(
                instance_port=8000,
                instance_protocol="http",
                lb_port=443,
                lb_protocol="https",
                ssl_certificate_id=test_cert.arn,
            )])
        ```

        ## Import

        IAM Server Certificates can be imported using the `name`, e.g.,

        ```sh
         $ pulumi import aws:iam/serverCertificate:ServerCertificate certificate example.com-certificate-until-2018
        ```

         [1]https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html [2]https://docs.aws.amazon.com/IAM/latest/UserGuide/ManagingServerCerts.html

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] certificate_body: The contents of the public key certificate in
               PEM-encoded format.
        :param pulumi.Input[str] certificate_chain: The contents of the certificate chain.
               This is typically a concatenation of the PEM-encoded public key certificates
               of the chain.
        :param pulumi.Input[str] name: The name of the Server Certificate. Do not include the
               path in this value. If omitted, this provider will assign a random, unique name.
        :param pulumi.Input[str] name_prefix: Creates a unique name beginning with the specified
               prefix. Conflicts with `name`.
        :param pulumi.Input[str] path: The IAM path for the server certificate.  If it is not
               included, it defaults to a slash (/). If this certificate is for use with
               AWS CloudFront, the path must be in format `/cloudfront/your_path_here`.
               See [IAM Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) for more details on IAM Paths.
        :param pulumi.Input[str] private_key: The contents of the private key in PEM-encoded format.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Map of resource tags for the server certificate. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ServerCertificateArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides an IAM Server Certificate resource to upload Server Certificates.
        Certs uploaded to IAM can easily work with other AWS services such as:

        - AWS Elastic Beanstalk
        - Elastic Load Balancing
        - CloudFront
        - AWS OpsWorks

        For information about server certificates in IAM, see [Managing Server
        Certificates][2] in AWS Documentation.

        ## Example Usage

        **Using certs on file:**

        ```python
        import pulumi
        import pulumi_aws as aws

        test_cert = aws.iam.ServerCertificate("testCert",
            certificate_body=(lambda path: open(path).read())("self-ca-cert.pem"),
            private_key=(lambda path: open(path).read())("test-key.pem"))
        ```

        **Example with cert in-line:**

        ```python
        import pulumi
        import pulumi_aws as aws

        test_cert_alt = aws.iam.ServerCertificate("testCertAlt",
            certificate_body=\"\"\"-----BEGIN CERTIFICATE-----
        [......] # cert contents
        -----END CERTIFICATE-----

        \"\"\",
            private_key=\"\"\"-----BEGIN RSA PRIVATE KEY-----
        [......] # cert contents
        -----END RSA PRIVATE KEY-----

        \"\"\")
        ```

        **Use in combination with an AWS ELB resource:**

        Some properties of an IAM Server Certificates cannot be updated while they are
        in use. In order for the provider to effectively manage a Certificate in this situation, it is
        recommended you utilize the `name_prefix` attribute and enable the
        `create_before_destroy`. This will allow this provider
        to create a new, updated `iam.ServerCertificate` resource and replace it in
        dependant resources before attempting to destroy the old version.

        ```python
        import pulumi
        import pulumi_aws as aws

        test_cert = aws.iam.ServerCertificate("testCert",
            name_prefix="example-cert",
            certificate_body=(lambda path: open(path).read())("self-ca-cert.pem"),
            private_key=(lambda path: open(path).read())("test-key.pem"))
        ourapp = aws.elb.LoadBalancer("ourapp",
            availability_zones=["us-west-2a"],
            cross_zone_load_balancing=True,
            listeners=[aws.elb.LoadBalancerListenerArgs(
                instance_port=8000,
                instance_protocol="http",
                lb_port=443,
                lb_protocol="https",
                ssl_certificate_id=test_cert.arn,
            )])
        ```

        ## Import

        IAM Server Certificates can be imported using the `name`, e.g.,

        ```sh
         $ pulumi import aws:iam/serverCertificate:ServerCertificate certificate example.com-certificate-until-2018
        ```

         [1]https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html [2]https://docs.aws.amazon.com/IAM/latest/UserGuide/ManagingServerCerts.html

        :param str resource_name: The name of the resource.
        :param ServerCertificateArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ServerCertificateArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 certificate_body: Optional[pulumi.Input[str]] = None,
                 certificate_chain: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 name_prefix: Optional[pulumi.Input[str]] = None,
                 path: Optional[pulumi.Input[str]] = None,
                 private_key: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ServerCertificateArgs.__new__(ServerCertificateArgs)

            if certificate_body is None and not opts.urn:
                raise TypeError("Missing required property 'certificate_body'")
            __props__.__dict__["certificate_body"] = certificate_body
            __props__.__dict__["certificate_chain"] = certificate_chain
            __props__.__dict__["name"] = name
            __props__.__dict__["name_prefix"] = name_prefix
            __props__.__dict__["path"] = path
            if private_key is None and not opts.urn:
                raise TypeError("Missing required property 'private_key'")
            __props__.__dict__["private_key"] = None if private_key is None else pulumi.Output.secret(private_key)
            __props__.__dict__["tags"] = tags
            __props__.__dict__["tags_all"] = tags_all
            __props__.__dict__["arn"] = None
            __props__.__dict__["expiration"] = None
            __props__.__dict__["upload_date"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["privateKey"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(ServerCertificate, __self__).__init__(
            'aws:iam/serverCertificate:ServerCertificate',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            certificate_body: Optional[pulumi.Input[str]] = None,
            certificate_chain: Optional[pulumi.Input[str]] = None,
            expiration: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            name_prefix: Optional[pulumi.Input[str]] = None,
            path: Optional[pulumi.Input[str]] = None,
            private_key: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            upload_date: Optional[pulumi.Input[str]] = None) -> 'ServerCertificate':
        """
        Get an existing ServerCertificate resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: The Amazon Resource Name (ARN) specifying the server certificate.
        :param pulumi.Input[str] certificate_body: The contents of the public key certificate in
               PEM-encoded format.
        :param pulumi.Input[str] certificate_chain: The contents of the certificate chain.
               This is typically a concatenation of the PEM-encoded public key certificates
               of the chain.
        :param pulumi.Input[str] expiration: Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) on which the certificate is set to expire.
        :param pulumi.Input[str] name: The name of the Server Certificate. Do not include the
               path in this value. If omitted, this provider will assign a random, unique name.
        :param pulumi.Input[str] name_prefix: Creates a unique name beginning with the specified
               prefix. Conflicts with `name`.
        :param pulumi.Input[str] path: The IAM path for the server certificate.  If it is not
               included, it defaults to a slash (/). If this certificate is for use with
               AWS CloudFront, the path must be in format `/cloudfront/your_path_here`.
               See [IAM Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) for more details on IAM Paths.
        :param pulumi.Input[str] private_key: The contents of the private key in PEM-encoded format.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Map of resource tags for the server certificate. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input[str] upload_date: Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) when the server certificate was uploaded.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ServerCertificateState.__new__(_ServerCertificateState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["certificate_body"] = certificate_body
        __props__.__dict__["certificate_chain"] = certificate_chain
        __props__.__dict__["expiration"] = expiration
        __props__.__dict__["name"] = name
        __props__.__dict__["name_prefix"] = name_prefix
        __props__.__dict__["path"] = path
        __props__.__dict__["private_key"] = private_key
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        __props__.__dict__["upload_date"] = upload_date
        return ServerCertificate(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        The Amazon Resource Name (ARN) specifying the server certificate.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="certificateBody")
    def certificate_body(self) -> pulumi.Output[str]:
        """
        The contents of the public key certificate in
        PEM-encoded format.
        """
        return pulumi.get(self, "certificate_body")

    @property
    @pulumi.getter(name="certificateChain")
    def certificate_chain(self) -> pulumi.Output[Optional[str]]:
        """
        The contents of the certificate chain.
        This is typically a concatenation of the PEM-encoded public key certificates
        of the chain.
        """
        return pulumi.get(self, "certificate_chain")

    @property
    @pulumi.getter
    def expiration(self) -> pulumi.Output[str]:
        """
        Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) on which the certificate is set to expire.
        """
        return pulumi.get(self, "expiration")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the Server Certificate. Do not include the
        path in this value. If omitted, this provider will assign a random, unique name.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="namePrefix")
    def name_prefix(self) -> pulumi.Output[str]:
        """
        Creates a unique name beginning with the specified
        prefix. Conflicts with `name`.
        """
        return pulumi.get(self, "name_prefix")

    @property
    @pulumi.getter
    def path(self) -> pulumi.Output[Optional[str]]:
        """
        The IAM path for the server certificate.  If it is not
        included, it defaults to a slash (/). If this certificate is for use with
        AWS CloudFront, the path must be in format `/cloudfront/your_path_here`.
        See [IAM Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) for more details on IAM Paths.
        """
        return pulumi.get(self, "path")

    @property
    @pulumi.getter(name="privateKey")
    def private_key(self) -> pulumi.Output[str]:
        """
        The contents of the private key in PEM-encoded format.
        """
        return pulumi.get(self, "private_key")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Map of resource tags for the server certificate. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        """
        A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        return pulumi.get(self, "tags_all")

    @property
    @pulumi.getter(name="uploadDate")
    def upload_date(self) -> pulumi.Output[str]:
        """
        Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) when the server certificate was uploaded.
        """
        return pulumi.get(self, "upload_date")

